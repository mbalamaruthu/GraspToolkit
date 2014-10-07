package uk.ac.standrews.graspide.grasp.validation

import java.util.HashSet
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage
import uk.ac.standrews.graspide.grasp.graspDSL.Layer
import uk.ac.standrews.graspide.grasp.graspDSL.Link

/**
 * Validations for Layer constructs
 */

class LayerValidator {
    var GraspDSLValidator validator = null;

    new(GraspDSLValidator validator) {

        this.validator = validator;

    }

    def void validateLayerReference(Layer layer) {
        if (layer.name == null)
            return;

        var container = layer.eContainer;

        if (container != null && container.eContents != null && container.eContents.size > 0) {

            for (content : container.eContents) {

                if (content instanceof Link) {

                    if (linkHasLayerReference(content, layer.name))
                        return;
                }
            }
        }
        validator.warning(
            "Layer '" + layer.name + "' is not referenced in a Link Configuration",
            layer,
            GraspDSLPackage.Literals::LINK_PROVIDER_PART__NAME
        )
    }

    private def linkHasLayerReference(Link link, String layer) {

        if (link.linkConsumer != null && link.linkConsumer.consumer instanceof Layer) {

            var consumername = (link.linkConsumer.consumer as Layer).name

            if (consumername != null && consumername.equals(layer))
                return true;
        }

        if (link.linkProviders != null && link.linkProviders.providers != null) {

            for (providerPart : link.linkProviders.providers) {

                if (providerPart != null && providerPart.provider instanceof Layer) {
                    var providerrname = providerPart.provider.name

                    if (providerrname != null && providerrname.equals(layer))
                        return true;
                }
            }
        }

        return false;
    }

    def validateLayersForCycles(Layer layer) {

        if (layer.name == null || layer.superLayer == null || layer.superLayer.size == 0) {
            return
        }
        val currentLayerName = layer.name

        var currentSuperLayers = new HashSet<Layer>()
        var visitedLayers = new HashSet<Layer>();
        visitedLayers.add(layer)
        currentSuperLayers.addAll(layer.superLayer)
        while (!currentSuperLayers.nullOrEmpty) {

            val currentSuperLayer = currentSuperLayers.head
            currentSuperLayers.remove(currentSuperLayer)

                    if (currentSuperLayer.name != null && currentLayerName.equals(currentSuperLayer.name)) {
                        validator.error(
                            "Cycle Exists Over Layers '" + layer.name + "' ",
                            GraspDSLPackage.Literals::LAYER__SUPER_LAYER
                        )
                        return
                    }


               if(visitedLayers.add(currentSuperLayer) && currentSuperLayer.superLayer != null && currentSuperLayer.superLayer.size > 0){
                        currentSuperLayers.addAll(currentSuperLayer.superLayer)
                }
            }

        }

    def validateSelfReferenceLayers(Layer layer) {
        if (layer.name == null || layer.superLayer == null || layer.superLayer.size == 0) {
            return
        }

        for (content : layer.superLayer) {
            if (content.name != null && layer.name.equals(content.name)) {
                validator.error(
                    "Layer cannot be Over itself '" + layer.name + "'",
                    content,
                    GraspDSLPackage.Literals::LAYER__SUPER_LAYER
                )
                return;
            }
        }
        var superLayerSet = new HashSet<String>();
        for (content : layer.superLayer) {
            if (content.name != null){

                if( !superLayerSet.add(content.name)) {
                validator.error(
                    "Duplicate Super Layers '" + content.name + "'",
                    layer,
                    GraspDSLPackage.Literals::LAYER__SUPER_LAYER
                )
                return;
            }
        }

        }
    }

}

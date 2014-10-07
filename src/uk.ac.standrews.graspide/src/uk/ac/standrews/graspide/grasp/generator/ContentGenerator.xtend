package uk.ac.standrews.graspide.grasp.generator

import java.util.List
import static uk.ac.standrews.graspide.grasp.generator.GeneratorData.*
import uk.ac.standrews.graspide.grasp.graspDSL.Rationale
import java.util.ArrayList

/**
 * Xtend file generation contents for code generation mappings using Xtend template expressions.
 */

class ContentGenerator {
    static var List<Rationale> rationales = new ArrayList<Rationale>();
    static var List<Rationale> requiredRationales =  new ArrayList<Rationale>();

    static def void setRationales(List<Rationale> rationaleInput){
        rationales = rationaleInput;
    }

    static def void setRequiredRationales(List<Rationale> rationaleInput){
        requiredRationales = rationaleInput;
    }

    static def CharSequence getRequireInterfaceContents(String interfaceType, String interfaceName, String packageName,List<String> importList) {
         '''
package «packageName»;

/**
 * «interfaceName» interface is created in mapping to the «interfaceType» element '«packageName»«IF interfaceType==REQUIRE_TYPE».«interfaceName»«ENDIF»'
 *
 «IF requiredRationales.size > 0»* Rationale for require Interface is «requiredRationales.join(", ",[rationale|rationale.name])»
 *«ENDIF»
 *@generated
 */

interface «interfaceName» {
    void setRequiredDependencies(«importList.join(", ")»);
    «IF rationales.size > 0»// Rationale for the Configuration is «rationales.join(", ",[rationale|rationale.name])»«ENDIF»
}
        '''
    }


    static def CharSequence getPackageInfoContents(String elementType, String packageName) {
        '''
/**
 * «packageName» package is created in mapping to the «elementType» element '«packageName»'
 *
 «IF rationales.size > 0»* Rationale for mapped element is «rationales.join(", ",[rationale|rationale.name])»
 *«ENDIF»
 *@generated
 */

package «packageName»;
        '''
    }


    static def CharSequence getInterfaceContents(String interfaceType, String interfaceName, String packageName) {
        '''
package «packageName»;

/**
 * «interfaceName» interface is created in mapping to the «interfaceType» element '«packageName»«IF interfaceType==PROVIDE_TYPE».«interfaceName»«ENDIF»'
 *
 «IF rationales.size > 0»* Rationale for mapped element is «rationales.join(", ",[rationale|rationale.name])»
 *«ENDIF»
 *@generated
 */

public interface «interfaceName» {

}
        '''
    }

}

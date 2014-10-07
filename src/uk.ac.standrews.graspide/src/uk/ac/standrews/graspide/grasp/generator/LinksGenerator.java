package uk.ac.standrews.graspide.grasp.generator;

import static uk.ac.standrews.graspide.grasp.generator.GeneratorData.COMPONENT_TYPE;
import static uk.ac.standrews.graspide.grasp.generator.GeneratorData.CONNECTOR_TYPE;
import static uk.ac.standrews.graspide.grasp.generator.GeneratorData.FILE_SEPERATOR;
import static uk.ac.standrews.graspide.grasp.generator.GeneratorData.JAVA_CONSTANT;
import static uk.ac.standrews.graspide.grasp.generator.GeneratorData.PACKAGE_SEPERATOR;
import static uk.ac.standrews.graspide.grasp.generator.GeneratorData.REQUIRE_TYPE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtend2.lib.EObjectExtensions;

import uk.ac.standrews.graspide.grasp.graspDSL.Architecture;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.Layer;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders;
import uk.ac.standrews.graspide.grasp.graspDSL.Provides;
import uk.ac.standrews.graspide.grasp.graspDSL.Requires;

import com.google.common.collect.Iterables;

/**
 * Generator Class for Link Configurations.
 *
 */

class LinksGenerator {

    final IFileSystemAccess fileSystem;
    final HashMap<String, List<Link>> linkConsumerPathMap = new HashMap<String, List<Link>>();
    final HashMap<String, String> linkProviderPathMap = new HashMap<String, String>();
    private GeneratorUtil generatorUtil = new GeneratorUtil();

    LinksGenerator(IFileSystemAccess fileSystem) {
        this.fileSystem = fileSystem;
    }

    void processLinks(Architecture architecture) {
        uk.ac.standrews.graspide.grasp.graspDSL.System system = architecture
                .getArchitecutrebody().getSystem();

        Iterable<EObject> iterableContents = EObjectExtensions
                .allContentsIterable(system);
        Iterable<Link> filteredContents = Iterables.<Link> filter(
                iterableContents, Link.class);

        for (final Link content : filteredContents) {
            addConsumertoLinkPathMap(content);
            addProvidertoLinkProviderMap(content);
        }

        createInterfacesForLinkRequires();
        createInterfacesForLinkProvides();
    }

    private void createInterfacesForLinkProvides() {
        Set<String> keySet = linkProviderPathMap.keySet();

        for (String key : keySet) {

            if (linkConsumerPathMap.get(key) != null)
                continue;

            final String interfaceName = getInterfaceNamefromKey(key);
            final String provideFileName = key + FILE_SEPERATOR + interfaceName
                    + JAVA_CONSTANT;
            String packageName = convertSlashtoDot(key);
            String type = linkProviderPathMap.get(key);
            final CharSequence provideContents = ContentGenerator
                    .getInterfaceContents(type, interfaceName, packageName);
            try {
                fileSystem.generateFile(provideFileName, provideContents);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void createInterfacesForLinkRequires() {
        Set<String> keySet = linkConsumerPathMap.keySet();

        for (String key : keySet) {

            final String interfaceName = getInterfaceNamefromKey(key);
            String provideFileName = key + JAVA_CONSTANT;
            String packageName = getPackageNamefromKey(key);
            List<String> importList = new ArrayList<String>();

            String type = REQUIRE_TYPE;

            final List<Link> linkList = linkConsumerPathMap.get(key);
            final LinkConsumerExpression linkConsumer = linkList.get(0)
                    .getLinkConsumer();
            LinkConsumerPart lastConsumer = generatorUtil.getLastConsumer(
                    linkConsumer, false);

            if (lastConsumer instanceof Component)
                type = COMPONENT_TYPE;
            else if (lastConsumer instanceof Connector)
                type = CONNECTOR_TYPE;

            if (type == COMPONENT_TYPE || type == CONNECTOR_TYPE) {
                packageName = convertSlashtoDot(key);
                provideFileName = key + FILE_SEPERATOR + interfaceName
                        + JAVA_CONSTANT;
            }

            populateImportNameList(key, importList);

            RationaleGenerator.extractAndSetRationales(linkList);
            final CharSequence provideContents = ContentGenerator
                    .getRequireInterfaceContents(type, interfaceName,
                            packageName, importList);
            try {
                fileSystem.generateFile(provideFileName, provideContents);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void populateImportNameList(String key, List<String> importList) {

        List<Link> links = linkConsumerPathMap.get(key);
        Set<String> interfaceNames = new HashSet<String>();

        for (Link link : links) {

            for (LinkProviders providers : link.getLinkProviders()
                    .getProviders()) {
                String fullPath = getProviderFullPath(providers);
                final String interfaceName = getInterfaceNamefromKey(fullPath);
                String packageName = getPackageNamefromKey(fullPath);
                LinkProviderPart lastProvider = generatorUtil
                        .getLastLinkProvider(providers);
                if (lastProvider instanceof Component
                        || lastProvider instanceof Connector) {
                    packageName = convertSlashtoDot(fullPath);
                }


                String stubInterfaceName = interfaceName.substring(0, 1).toLowerCase()
                        + interfaceName.substring(1);

                String uniqueInterfaceName = stubInterfaceName;

                int i = 1;
                while(interfaceNames.contains(uniqueInterfaceName)){
                    uniqueInterfaceName = stubInterfaceName + i;
                    i++;
                }
                interfaceNames.add(uniqueInterfaceName);
                String importedName = packageName + PACKAGE_SEPERATOR
                        + interfaceName + " " + uniqueInterfaceName;

                importList.add(importedName);
            }
        }
    }

    private String getInterfaceNamefromKey(String key) {
        String interfaceName = key;
        int lastIndex = key.lastIndexOf(FILE_SEPERATOR);

        if (lastIndex != -1) {
            interfaceName = key.substring(lastIndex + 1);
        }
        return interfaceName;
    }

    private String getPackageNamefromKey(String key) {
        int lastIndex = key.lastIndexOf(FILE_SEPERATOR);
        String packageName = key;
        if (lastIndex != -1)
            packageName = key.substring(0, lastIndex);
        return convertSlashtoDot(packageName);
    }

    private void addProvidertoLinkProviderMap(Link content) {
        EList<LinkProviders> providers = content.getLinkProviders()
                .getProviders();
        for (LinkProviders provider : providers) {
            EObject lastProvider = generatorUtil.getLastLinkProvider(provider);

            if (lastProvider instanceof Component
                    || lastProvider instanceof Connector) {
                String type = COMPONENT_TYPE;
                if (lastProvider instanceof Connector)
                    type = CONNECTOR_TYPE;

                String fullPath = getProviderFullPath(provider);
                linkProviderPathMap.put(fullPath, type);
            }
        }
    }

    private String getProviderFullPath(LinkProviders provider) {
        String fullPath = getFullPath(provider.getProvider());

        Iterable<String> rightList = provider.getRightProvider();
        int size = 0;
        if (rightList != null)
            size = IterableExtensions.size(rightList);
        if (size > 0) {
            String lastKeyword = ((String[]) Conversions.unwrapArray(rightList,
                    String.class))[size - 1];
            if (lastKeyword.equals("in")) {
                rightList = IterableExtensions.<String> take(rightList,
                        size - 1);
            }
            for (String right : rightList) {
                fullPath += FILE_SEPERATOR + right;
            }
        }
        return fullPath;
    }

    private void addConsumertoLinkPathMap(Link content) {
        LinkConsumerPart consumer = content.getLinkConsumer().getConsumer();
        String fullPath = getFullPath(consumer);
        Iterable<String> rightList = content.getLinkConsumer()
                .getRightConsumer();

        int size = 0;
        if (rightList != null)
            size = IterableExtensions.size(rightList);
        if (size > 0) {
            String lastKeyword = ((String[]) Conversions.unwrapArray(rightList,
                    String.class))[size - 1];
            if (lastKeyword.equals("out")) {
                rightList = IterableExtensions.<String> take(rightList,
                        size - 1);
            }
            for (String right : rightList) {
                fullPath += FILE_SEPERATOR + right;
            }
        }
        if (linkConsumerPathMap.get(fullPath) == null) {
            linkConsumerPathMap.put(fullPath, new ArrayList<Link>());
        }

        linkConsumerPathMap.get(fullPath).add(content);
    }

    private String getFullPath(EObject object) {
        String path = getName(object);

        while (object.eContainer() instanceof LinkConsumerPart) {
            object = (LinkConsumerPart) object.eContainer();
            path = getName(object) + FILE_SEPERATOR + path;
        }
        return path;
    }

    private String getName(EObject consumer) {
        if (consumer instanceof Layer) {
            return ((Layer) consumer).getName();
        } else if (consumer instanceof Component) {
            return ((Component) consumer).getName();
        } else if (consumer instanceof Connector) {
            return ((Connector) consumer).getName();
        } else if (consumer instanceof Requires) {
            return ((Requires) consumer).getType();
        } else if (consumer instanceof Provides) {
            return ((Provides) consumer).getName();
        }
        return null;
    }

    String convertSlashtoDot(String lowerTemplateName) {
        return lowerTemplateName.replace(FILE_SEPERATOR, PACKAGE_SEPERATOR);
    }

}

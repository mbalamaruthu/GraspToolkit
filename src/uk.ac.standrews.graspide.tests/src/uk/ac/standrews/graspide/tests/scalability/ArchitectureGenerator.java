package uk.ac.standrews.graspide.tests.scalability;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Java program to generate a Random architecture at the project root directory based on the
 * initialised parameters
 */
public class ArchitectureGenerator {


    public static void main(String[] args){
        Architecture architecture = new Architecture();
        initializeArchitectureValues(architecture);
        ContentGenerator generator = new ContentGenerator(architecture);
        final String architectureContents = generator.getArchitectureContents();
        System.out.println(architectureContents);
        writeToFile(architectureContents);
    }

    private static void writeToFile(String architectureContents) {
        try {
            File file = new File("ScalableTest250Components.grasp");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(architectureContents);
            writer.close();
          } catch (Exception e ) {
             e.printStackTrace();
          }

    }

    private static void initializeArchitectureValues(Architecture architecture) {
        architecture.setArchitectureName("TestArchitecture");
        architecture.setSystemName("TestSystem");


        architecture.setComponentCount(new Long(250));
        architecture.setComponentNestedLevels(5);
        architecture.setLinkCount(new Long(100));
        architecture.setQualityAttributeCount(new Long(50));
        architecture.setRationaleCount(new Long(100));
        architecture.setRequirementCount(new Long(50));
        architecture.setTemplateCount(new Long(50));
        architecture.setMaximumComponentsAtSameLevel(4);
    }

}

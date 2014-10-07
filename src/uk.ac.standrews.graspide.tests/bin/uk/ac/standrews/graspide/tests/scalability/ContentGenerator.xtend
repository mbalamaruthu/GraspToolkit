package uk.ac.standrews.graspide.tests.scalability

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Random

/**
 * Xtend file to generate architecture contents based on the initialised parameters set
 * by ArchitectureGenerator class
 */

class ContentGenerator {
    private var Architecture architecture;
    private val HashMap<Long, List<Long>> linkMap = new HashMap<Long, List<Long>>();
    private val HashMap<Long, Long> componentParentMap = new HashMap<Long, Long>();

    new(Architecture architecture) {
        this.architecture = architecture;
    }

    def String getArchitectureContents() {
        var StringBuilder content = new StringBuilder();

        content.append(
            '''
//
// An auto generated test architecture
//
architecture «architecture.architectureName»
{
// Requirements and quality attribute specifiers
''');

        var long counter = 0;

        while (counter < architecture.requirementCount) {
            content.append(
                '''
                    requirement testRequirement«counter» ;
                '''
            );
            counter = counter + 1;
        }

        counter = 0;
        while (counter < architecture.qualityAttributeCount) {
            content.append(
                '''

                quality_attribute testQualityAttribute«counter»'''
            );

            content.append(''';''')
            counter = counter + 1;
        }

        content.append(
            '''

// Rationale descriptors
''');
        counter = 0;
        while (counter < architecture.rationaleCount) {
            content.append(
                '''
                    rationale testRationale«counter»(){
                ''');
            if (isSupportPossible()) {
                content.append(
                    '''
                    reason supports ''');
                content.append(getSupportedQualityRequirements(counter)).append(''';''');
            }

            content.append(
                '''

                    }
                '''
            );
            counter = counter + 1;

        }

        content.append(
            '''// Template descriptions

''');
        counter = 0;
        while (counter < architecture.templateCount) {
            content.append(
                '''
                    template testTemplate«counter»(){
                    }
                '''
            );
            counter = counter + 1;

        }

        content.append(
            '''
            // System structure
            system «architecture.systemName» {''');

        content.append(getSystemContents());

        content.append(
            '''
}
}
        ''');
        return content.toString();
    }

    def String getSupportedQualityRequirements(long l) {
        if (hasHalfChance) {
            val requirementIndex = getRandomLong(0, architecture.requirementCount);
            return "testRequirement" + requirementIndex;

        } else {
            val qualityIndex = getRandomLong(0, architecture.requirementCount);
            return "testQualityAttribute" + qualityIndex;
        }
    }

    def boolean isSupportPossible() {
        if (architecture.requirementCount + architecture.qualityAttributeCount > 2) {
            return hasHalfChance;
        }
        return false;
    }

    def String getSystemContents() {

        var long counter = 0;
        val StringBuilder content = new StringBuilder();

        while (counter < architecture.componentCount) {
            generatePartialComponent(content, counter)
            counter = counter + 1;
            var chance = architecture.componentNestedLevels;
            var int nestedLength = 0;

            while (hasNestableChance(chance, counter, nestedLength)) {

                generatePartialComponent(content, counter)
                System.out.println("Nested Parent "+counter);
                componentParentMap.put(counter, counter - 1);
                nestedLength = nestedLength + 1;
                chance = chance - 1;
                counter = counter + 1;
            }


            var long currentLevelComponentId = counter - 1;

            while (nestedLength > 0) {

                var long otherComponents = 0;

                while (canHaveOtherComponentsAtSameLevel(otherComponents, counter, nestedLength)) {
                    generatePartialComponent(content, counter)
                    System.out.println("Level Parent "+counter+", "+ currentLevelComponentId);
                    componentParentMap.put(counter, currentLevelComponentId);
                    content.append(
                        '''}
                            ''')
                    counter = counter + 1;
                    otherComponents = otherComponents + 1;
                }
                nestedLength = nestedLength - 1;
                content.append(
                    '''
                    }''');
                currentLevelComponentId = currentLevelComponentId - 1;
            }

            content.append(
                '''
                }''');

        }
        content.append("\n");
        counter = 0;
        var long randomSource = 0;
        while (counter < architecture.linkCount) {
            randomSource = getRandomLong(0, architecture.componentCount);
            content.append(
                '''
                link «getComponentFullPath(randomSource)».out to «getComponentFullPath(getTargetRandomComponent(randomSource))».in''');

            if (hasHalfChance) {
                val randomRationale = getRandomLong(0, architecture.rationaleCount);
                content.append(''' because testRationale«randomRationale»()''')

            }
            content.append(
                ''';
                    ''');
            counter = counter + 1;
        }
        return content.toString();
    }

    def getComponentFullPath(long componentId) {
        var StringBuilder fullPath = new StringBuilder();
        fullPath.append("testComponent").append(componentId);
        var currentComponent = componentId;
        while(componentParentMap.get(currentComponent)!= null){
            currentComponent = componentParentMap.get(currentComponent);
            fullPath.insert(0,"testComponent"+currentComponent+".");
        }
        return fullPath.toString();
    }


    def generatePartialComponent(StringBuilder content, long componentId) {
        val randomTemplate = getRandomLong(0, architecture.templateCount);
        content.append(
            '''

            component testComponent«componentId» = testTemplate«randomTemplate»()'''
        );

        if (hasHalfChance) {
            val randomRationale = getRandomLong(0, architecture.rationaleCount);
            content.append(''' because testRationale«randomRationale»()''')
        }
        content.append('''{''');
    }

    def long getTargetRandomComponent(long source) {
        var randomTarget = getRandomLong(0, architecture.componentCount);
        if (linkMap.get(source) != null) {

            var long safetyCount = 0;
            while (source == randomTarget || linkMap.get(source).contains(randomTarget) && safetyCount < 100) {
                randomTarget = getRandomLong(0, architecture.componentCount);
                safetyCount = safetyCount + 1;
            }

        } else {
            val targetList = new ArrayList();
            targetList.add(randomTarget);
            linkMap.put(source, targetList);

        }

        return randomTarget;

    }
    // Greater chance of Nesting 1- 1/chance and decreases with remaining nesting level decreases
    def hasNestableChance(int remainingLevels, long counter, long currentLength) {
        currentLength < architecture.componentNestedLevels && remainingLevels > 0 && counter < architecture.componentCount && hasComplementChance(remainingLevels)
    }

    // 3/4 probability
    def canHaveOtherComponentsAtSameLevel(long numberOfComponentsAtSameLevel, long counter, int nestedLength) {
        nestedLength > 0 && numberOfComponentsAtSameLevel< architecture.maximumComponentsAtSameLevel && counter < architecture.componentCount && hasComplementChance(4)
    }


/**
 *
 * Chances Methods
 */

     def boolean hasHalfChance() {
        return hasChance(2);
    }

    /**
 * Give true with a probability 1/chance
 */
    def boolean hasChance(int chance) {
        val Random random = new Random();
        val randomValue = random.nextInt(chance);
        if (randomValue == 1)
            return true;
        return false;
    }

    /**
 * Give true with a probability 1 - 1/chance
 */
    def boolean hasComplementChance(int chance) {
        val Random random = new Random();
        val randomValue = random.nextInt(chance);
        if (randomValue != 1)
            return true;
        return false;
    }

    def long getRandomLong(long min, long max) {
        return (min + (Math.random() * (max - min))) as long;
    }


}

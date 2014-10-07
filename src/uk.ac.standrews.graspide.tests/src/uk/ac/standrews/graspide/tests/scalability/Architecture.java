package uk.ac.standrews.graspide.tests.scalability;


/**
 * Container class for Architecture initialisation parameters
 *
 */
public class Architecture {
    private String architectureName, systemName;
    private Long qualityAttributeCount, requirementCount, rationaleCount, templateCount, componentCount, linkCount;
    private int componentNestedLevels, maximumComponentsAtSameLevel;
    /**
     * @return the maximumComponentsAtSameLevel
     */
    public final int getMaximumComponentsAtSameLevel() {
        return maximumComponentsAtSameLevel;
    }
    /**
     * @param maximumComponentsAtSameLevel the maximumComponentsAtSameLevel to set
     */
    public final void setMaximumComponentsAtSameLevel(
            int maximumComponentsAtSameLevel) {
        this.maximumComponentsAtSameLevel = maximumComponentsAtSameLevel;
    }
    /**
     * @return the componentNestedLevels
     */
    public final int getComponentNestedLevels() {
        return componentNestedLevels;
    }
    /**
     * @param componentNestedLevels the componentNestedLevels to set
     */
    public final void setComponentNestedLevels(int componentNestedLevels) {
        this.componentNestedLevels = componentNestedLevels;
    }
    /**
     * @return the architectureName
     */
    public final String getArchitectureName() {
        return architectureName;
    }
    /**
     * @param architectureName the architectureName to set
     */
    public final void setArchitectureName(String architectureName) {
        this.architectureName = architectureName;
    }
    /**
     * @return the systemName
     */
    public final String getSystemName() {
        return systemName;
    }
    /**
     * @param systemName the systemName to set
     */
    public final void setSystemName(String systemName) {
        this.systemName = systemName;
    }
    /**
     * @return the qualityAttributeCount
     */
    public final Long getQualityAttributeCount() {
        return qualityAttributeCount;
    }
    /**
     * @param qualityAttributeCount the qualityAttributeCount to set
     */
    public final void setQualityAttributeCount(Long qualityAttributeCount) {
        this.qualityAttributeCount = qualityAttributeCount;
    }
    /**
     * @return the requirementCount
     */
    public final Long getRequirementCount() {
        return requirementCount;
    }
    /**
     * @param requirementCount the requirementCount to set
     */
    public final void setRequirementCount(Long requirementCount) {
        this.requirementCount = requirementCount;
    }
    /**
     * @return the rationaleCount
     */
    public final Long getRationaleCount() {
        return rationaleCount;
    }
    /**
     * @param rationaleCount the rationaleCount to set
     */
    public final void setRationaleCount(Long rationaleCount) {
        this.rationaleCount = rationaleCount;
    }
    /**
     * @return the templateCount
     */
    public final Long getTemplateCount() {
        return templateCount;
    }
    /**
     * @param templateCount the templateCount to set
     */
    public final void setTemplateCount(Long templateCount) {
        this.templateCount = templateCount;
    }
    /**
     * @return the componentCount
     */
    public final Long getComponentCount() {
        return componentCount;
    }
    /**
     * @param componentCount the componentCount to set
     */
    public final void setComponentCount(Long componentCount) {
        this.componentCount = componentCount;
    }

    public final Long getLinkCount() {
        return linkCount;
    }
    /**
     * @param linkCount the linkCount to set
     */
    public final void setLinkCount(Long linkCount) {
        this.linkCount = linkCount;
    }

}

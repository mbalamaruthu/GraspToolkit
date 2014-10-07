package uk.ac.standrews.graspide.grasp.validation;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IPreferencesService;

/**
 * Retrieves Validation Preferences to identify enabled and disabled validations.
 *
 */
public class GraspValidationPreferences {
    private static final Logger log = Logger
            .getLogger(GraspValidationPreferences.class);
    private static final String QUALIFIER = "uk.ac.standrews.graspide.grasp.GraspDSL";
    private final IPreferencesService prefs;
    private static boolean allValidationEnabled;


    GraspValidationPreferences() {
        prefs = Platform.getPreferencesService();
    }

    boolean isValidationEnabled(String preferenceId) {

        if (allValidationEnabled)
            return true;
        boolean preference = prefs.getBoolean(QUALIFIER, preferenceId, true,
                null);

        log.debug("Preference for " + preferenceId + " is " + preference);

        return preference;
    }

    boolean isExpensiveValidationsEnabled() {
        if (allValidationEnabled)
            return true;
        boolean preference = prefs.getBoolean(QUALIFIER,
                "ExpensiveValidations", true, null);

        log.debug("Preference for Expensive validations is " + preference);

        return preference;
    }

    boolean isDefaultValidationsEnabled() {
        if (allValidationEnabled)
            return true;
        boolean preference = prefs.getBoolean(QUALIFIER, "DefaultValidations",
                true, null);

        log.debug("Preference for Default validations is " + preference);

        return preference;
    }

    /**
     * @return the allValidationEnabled
     */
    public static final boolean isAllValidationEnabled() {
        return allValidationEnabled;
    }

    /**
     * @param allValidationEnabled
     *            the allValidationEnabled to set
     */
    public static final void setAllValidationEnabled(
            boolean allValidationEnabled) {
        GraspValidationPreferences.allValidationEnabled = allValidationEnabled;
    }


}

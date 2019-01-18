package duraklefkan.gtu.cse443.hw2.question3.design1;

/**
 * Enumarations to keep model of plane
 */
public enum ModelType {

    // Enumarations

    /**
     * Represents TPX 100 model plane
     */
    TPX100,

    /**
     * Represents TPX 200 model plane
     */
    TPX200,

    /**
     * Represents TPPX 300 model plane
     */
    TPX300;

    // String representations of enumarations
    private static String TPX100_TO_STR = "TPX 100";
    private static String TPX200_TO_STR = "TPX 200";
    private static String TPX300_TO_STR = "TPX 300";

    /**
     * Parse given string to ModelType, by looking
     * string representations.
     * @param modelType model type in string format
     * @return parsed model type
     * @throws Exception when given model type is invalid
     */
    public static ModelType parse(String modelType) throws Exception {

        if (modelType.equals(TPX100_TO_STR))
            return TPX100;
        if (modelType.equals(TPX200_TO_STR))
            return TPX200;
        if (modelType.equals(TPX300_TO_STR))
            return TPX300;
        throw new Exception("Invalid model type " + modelType);
    }

    /**
     * Returns string representation of this enumaration.
     *
     * @return string representation of this enumaration
     */
    @Override
    public String toString() {

        switch (this) {

            case TPX100:
                return TPX100_TO_STR;
            case TPX200:
                return TPX200_TO_STR;
            case TPX300:
                return TPX300_TO_STR;

        }
        return null;
    }
}

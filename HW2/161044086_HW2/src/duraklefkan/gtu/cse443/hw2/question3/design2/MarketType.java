package duraklefkan.gtu.cse443.hw2.question3.design2;

public enum MarketType {

    /**
     * Represents Domestic market
     */
    DOMESTIC,

    /**
     * Represents Euresia market
     */
    EURASIA,

    /**
     * Represents Other markets.
     */
    OTHER;

    // String representation of enumarations
    private static String DOMESTIC_TO_STR = "Domestic Market";
    private static String EURASIA_TO_STR = "Eurasia Market";
    private static String OTHER_TO_STR =  "Other markets";

    /**
     * Parse given string to MarketType, by looking
     * string representations.
     * @param marketType market type in string format
     * @return parsed market type
     * @throws Exception
     */
    public static MarketType parse(String marketType) throws Exception {

        if (marketType.equals(DOMESTIC_TO_STR))
            return DOMESTIC;
        if (marketType.equals(EURASIA_TO_STR))
            return EURASIA;
        if (marketType.equals(OTHER_TO_STR))
            return OTHER;
        throw new Exception("Invalid Market Type " + marketType);
    }

    /**
     * Returns string representations of this enumaration.
     *
     * @return string representation of this enumaration
     */
    @Override
    public String toString() {
        return "MarketType{}";
    }
}

package materials;

/**
 * Copper is a singleton metal
 */
public class Copper extends Metal {

    private static Copper instance; //Singleton

    /**
     * Empty constructor for singleton
     */
    private Copper() {}

    /**
     * @return the singleton of copper
     */
    public static Copper getInstance() {
        if (instance == null) { instance = new Copper(); }
        return instance;
    }

    /**
     * @return density of copper
     */
    @Override
    public double getDensity() {
        return 8.96;
    }
}

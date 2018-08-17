package materials;

/**
 * Zinc is a singleton metal
 */
public class Zinc extends Metal {

    private static Zinc instance; //Singleton

    /**
     * Empty constructor for singleton
     */
    private Zinc() {}

    /**
     * @return the singleton of copper
     */
    public static Zinc getInstance() {
        if (instance == null) { instance = new Zinc(); }
        return instance;
    }

    /**
     * @return density of zinc in g/cm^3
     */
    @Override
    public double getDensity() {
        return 7.14;
    }

}

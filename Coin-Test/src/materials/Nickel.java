package materials;

/**
 * Nickel is a singleton metal
 */
public class Nickel extends Metal {

    private static Nickel instance; //Singleton

    /**
     * Empty constructor for singleton
     */
    private Nickel() {}

    /**
     * @return the singleton of copper
     */
    public static Nickel getInstance() {
        if (instance == null) { instance = new Nickel(); }
        return instance;
    }

    /**
     * @return density of zinc in g/cm^3
     */
    @Override
    public double getDensity() {
        return 8.912;
    }

}

package materials;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * An alloy of a number of elements; density is a weighted average
 */
public class Alloy extends Metal {

    HashMap<Metal, Double> components = new HashMap<Metal, Double>(); //What metals the alloy contains, and their mass fraction out of 1

    public Alloy() {}

    public Alloy(ArrayList<Metal> components, ArrayList<Double> fractions) {
        for (int i = 0; i < components.size(); i++) {
            this.components.put(components.get(i), fractions.get(i));
        }
    }

    /**
     * @return density in g/cm^3
     */
    @Override
    public double getDensity() {
        return components.keySet().stream().map(metal -> metal.getDensity() * this.components.get(metal)).reduce(0.0, (a, b) -> a + b);
    }

}

package coins;

import materials.Alloy;
import materials.Copper;
import materials.Metal;
import materials.Zinc;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A coin with a value of 1 cent
 */
public class Penny extends Coin {

    /**
     * Constructs a penny given the current year
     */
    public Penny(int year) {
        this.value = 1;
        this.name = "Penny";
        this.radius = 9.525;
        this.thickness = 1.52;
        this.year = year;
        if (year > 1982) {
            this.material = new Alloy(
                    new ArrayList<Metal>(Arrays.asList(Copper.getInstance(), Zinc.getInstance())),
                    new ArrayList<Double>(Arrays.asList(0.025, 0.975))
            );
        } else {
            this.material = new Alloy(
                    new ArrayList<Metal>(Arrays.asList(Copper.getInstance(), Zinc.getInstance())),
                    new ArrayList<Double>(Arrays.asList(0.95, 0.05))
            );
        }
    }

}

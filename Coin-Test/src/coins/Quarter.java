package coins;

import materials.Alloy;
import materials.Copper;
import materials.Metal;
import materials.Nickel;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A coin with a value of 25 cents
 */
public class Quarter extends Coin {

    /**
     * Constructs a penny given the current year
     */
    public Quarter(int year) {
        this.value = 25;
        this.name = "Quarter";
        this.radius = 12.13;
        this.thickness = 1.75;
        this.year = year;
        this.material = new Alloy(
                new ArrayList<Metal>(Arrays.asList(Copper.getInstance(), Nickel.getInstance())),
                new ArrayList<Double>(Arrays.asList(0.9167, 0.833))
        );
    }

}

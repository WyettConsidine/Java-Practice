package coins;

import materials.Metal;

/**
 * Stores attributes that all coins contain
 */
public class Coin {

    public int value; //How many cents the coin is worth
    public String name; //The name of the coin (e.g. penny)
    public double radius; //The radius of the coin (in mm)
    public double thickness; //The thickness of the coin (in mm)
    public int year; //When the coin was minted
    public Metal material; //What the coin is made of

    /**
     * @return the area of one face of the coin in mm^2
     */
    public double getFaceArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * @return the volume of the coin in mm^3
     */
    public double getVolume() {
        return this.getFaceArea() * this.thickness;
    }

    /**
     * @return the mass of the coin in g
     */
    public double getMass() {
        //Don't forget to convert volume to cm^3
        return this.getVolume() / 1000 * this.material.getDensity();
    }

}

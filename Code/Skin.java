/**
 * Name: Xuan
 * Date: 05/02/2022
 * Description: A program that houses the Skin class and all its attributes,
 * accessors, mutators, and other methods.
 */

public class Skin {

    /** The name of the skin */
    private String name;

    /** Has the skin been upgraded or not */
    private boolean upgrade;

    /** The price of the skin in valorant points */
    private int price;

    /**
     * Constructor for skin object
     * 
     * @param name    the name of the skin
     * @param upgrade if the skin has been upgraded or not
     * @param price   the price of the skin in valorant points
     */
    public Skin(String name, boolean upgrade, int price) {
        this.name = name;
        this.upgrade = upgrade;
        this.price = price;
    }

    public String getName() {

        return this.name;

    }

    public boolean getUpgradeable() {

        return this.upgrade;

    }

    public int getPrice() {

        return this.price;

    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * return a default skin for testing
     * @return
     */
    public static Skin getDefaultSkin(){
        Skin DSkin = new Skin("DSkin", false, 100);
        return DSkin;
    }

    public String toString() {

        String skinString = "";

        skinString = skinString + "Name: " + this.name + "\n";
        skinString = skinString + "Upgradeable: " + this.upgrade + "\n";
        skinString = skinString + "Price: " + this.price + "VP\n";
        return skinString;

    }

}

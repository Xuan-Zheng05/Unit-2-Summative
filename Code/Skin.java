import java.util.ArrayList;

/**
 * Name: Xuan
 * Date: 05/02/2022
 * Description: A program that houses the Skin class and all its attributes,
 * accessors, mutators, and other methods.
 */

public class Skin {

    /** The name of the skin */
    private String name;

    /** The gun the skin can be applied to */
    private String gunName;

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
    public Skin(String name, String gunName, boolean upgrade, int price) {
        this.name = name;
        this.gunName = gunName;
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
     * 
     * @return dSkin the default skin for testing
     */
    public static Skin getDefaultSkin() {
        Skin dSkin = new Skin("DSkin", "Default", false, 100);
        return dSkin;
    }

    /**
     * buys a skin and adds it to the user profile
     * 
     * method dependant on the UserProfile class that a groupmate made
     * 
     * @param skin    the skin being bought
     * @param profile the user buying the skin
     * 
     */
    public void buySkin(Skin skin, UserProfile profile) {

        // checks if you can buy the skin with current amount of currency
        if (profile.getInventory().getValPoint() >= this.price) {
            ArrayList<Skin> skinList = profile.getInventory().getOwnedSkin();
            skinList.add(skin);
            profile.getInventory().addSkin(skinList);
        }
    }

    /**
     * checks if you can actually apply the skin to the gun
     * 
     * method dependant on the Gun class that I made
     * 
     * @param gun the gun being applied to
     * @return applyable if the skin can be applied
     */
    public boolean checkApplyable(Gun gun) {

        boolean applyable = false;
        if (this.gunName.equals(gun.getName()) || this.gunName.equals("Default")) {
            applyable = true;
        }
        return applyable;
    }

    /**
     * toString method returns all the attributes of the skin in a String
     * 
     * @return skinString string containing the attributes of the skin
     */
    public String toString() {

        String skinString = "";

        skinString = skinString + "Name: " + this.name + "\n";
        skinString = skinString + "Upgradeable: " + this.upgrade + "\n";
        skinString = skinString + "Price: " + this.price + "VP\n";
        return skinString;

    }

}

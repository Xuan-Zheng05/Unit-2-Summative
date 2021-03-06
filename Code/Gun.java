import java.util.ArrayList;

/**
 * Name: Xuan Date: 04/28/2022 Description: A program that houses the Gun class
 * and all its attributes, accessors, mutators, and other methods.
 */

public class Gun {

    /*
     * Attributes
     */

    /** name of the gun */
    private String name;

    /** skin of the gun */
    private Skin skin;

    /** cost of the gun */
    private int cost;

    /** if the fire mode is automatic */
    private boolean automatic;

    /** time it takes for the gun to reload */
    private double reloadSpeed;

    /** how much ammo is in each magazine */
    private int magazine;

    /** how many bullets a magazine can store */
    private int magazineSize;

    /** how many bullets the gun has in reserve */
    private int reserve;

    /** how many bullets the gun fires each second */
    private double fireRate;

    /** amount of dmg each shot does to the head */
    private int headDmg;

    /** amound of dmg each shot does to the body */
    private int bodyDmg;

    /** amound of dmg each shot does to the leg */
    private int legDmg;

    /** if you can buy guns or not */
    private static boolean canBuyWeapon;

    /**
     * Constructor
     * 
     * @param name         name of the gun
     * @param skin         skin of the gun
     * @param cost         cost of the gun
     * @param automatic    firemode of the gun
     * @param reloadSpeed  time it takes for reload
     * @param magazine     how many bullets in each magazine
     * @param magazineSize how many bullets a magazine can store
     * @param reserve      how many bullets in reserve
     * @param fireRate     how many bullets the gun fires each second
     * @param headDmg      dmg of a headshot
     * @param bodyDmg      dmg of a bodyshot
     * @param legDmg       dmg of legshot
     */
    public Gun(String name, Skin skin, int cost, boolean automatic, double reloadSpeed, int magazine, int magazineSize,
            int reserve, double fireRate, int headDmg, int bodyDmg, int legDmg) {

        this.name = name;
        this.skin = skin;
        this.cost = cost;
        this.automatic = automatic;
        this.reloadSpeed = reloadSpeed;
        this.magazine = magazine;
        this.magazineSize = magazineSize;
        this.reserve = reserve;
        this.fireRate = fireRate;
        this.headDmg = headDmg;
        this.bodyDmg = bodyDmg;
        this.legDmg = legDmg;
        this.canBuyWeapon = true;

    }

    /*
     * Accessors
     */

    public String getName() {

        return this.name;

    }

    public Skin getSkin() {

        return this.skin;

    }

    public int getCost() {

        return this.cost;

    }

    public double getReloadSpeed() {

        return this.reloadSpeed;

    }

    public int getMagazine() {

        return this.magazine;

    }

    public int getReserve() {
        return this.reserve;
    }

    public int getHeadDmg() {

        return this.headDmg;

    }

    public int getBodyDmg() {

        return this.bodyDmg;

    }

    public int getLegDmg() {

        return this.legDmg;

    }

    /*
     * Methods
     */

    /**
     * shoot method subtracts one bullet from the magazine each time it is shot
     * 
     * @param times times you shoot the gun
     * 
     */
    public void shoot(int times) {

        this.magazine -= times;

        if (this.magazine < 0) {

            this.magazine = 0;

        }

    }

    /**
     * reload method reloads the magazine to magazine size. if there is not enough
     * reserve ammo for a full reload, only reload how much reserve ammo there is
     */
    public void reload() {

        // if amount of ammo in reserve is not enough to fill the entire magazine
        if (this.reserve - magazineSize < 0) {

            this.magazine = this.reserve;
            this.reserve = 0;

        } else {

            this.reserve -= magazineSize - magazine;
            this.magazine = magazineSize;

        }

    }

    /**
     * sets the canBuyWeapon variable to false
     */
    public static void disableBuy() {

        canBuyWeapon = false;

    }

    /**
     * changes the skin of the gun by getting all the skins of the user profile and
     * checking if the skin is in the user inventory
     * 
     * this is the method dependant on the skin class I did and is dependant on the
     * userProfile class
     * 
     * @param skin    the skin being bought
     * @param profile the profile of the player changing their skin
     */

    public void changeSkin(Skin skin, UserProfile profile) {

        ArrayList<Skin> list = profile.getInventory().getOwnedSkin();

        // loops through the arraylist to check if the skin is there
        boolean hasSkin = false;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(skin)) {

                hasSkin = true;

            }

        }

        // is the skin is in the inventory, change the skin
        if (hasSkin) {

            this.skin = skin;

        }

    }

    /**
     * toString method returns all the attributes of the gun in a String
     * 
     * @return gunString string containing the attributes of the gun
     */
    public String toString() {

        String gunString = "";

        gunString = gunString + "Name: " + this.name + "\n";
        gunString = gunString + "Skin: " + this.skin.getName() + "\n";
        gunString = gunString + "Cost: $" + this.cost + "\n";
        gunString = gunString + "Automatic: " + this.automatic + "\n";
        gunString = gunString + "Reload Speed: " + this.reloadSpeed + "s\n";
        gunString = gunString + "Magazine: " + this.magazine + " rounds\n";
        gunString = gunString + "Magazine Size: " + this.magazineSize + " rounds\n";
        gunString = gunString + "Reserve: " + this.reserve + " rounds\n";
        gunString = gunString + "Fire rate: " + this.fireRate + " rounds/s\n";
        gunString = gunString + "Head dmg: " + this.headDmg + "\n";
        gunString = gunString + "Body dmg: " + this.bodyDmg + "\n";
        gunString = gunString + "Leg dmg: " + this.legDmg + "\n";
        return gunString;

    }

}

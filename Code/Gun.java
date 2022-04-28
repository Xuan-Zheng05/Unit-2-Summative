/**
 * Name: Xuan
 * Date: 04/28/2022
 *
 * Description:
 * A program that houses the Gun class and all its attributes, accessors,
 * mutators, and other methods.
 */

public class Gun {
    /*
     * Attributes
     */

    /** name of the gun */
    private String name;

    /** if the gun is a sidearm */
    private boolean sidearm;

    /** cost of the gun */
    private int cost;

    /** if the fire mode is automatic */
    private boolean automatic;

    /** time it takes for the gun to reload */
    private double reloadSpeed;

    /** how much ammo is in each magazine */
    private int magazine;

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

    /**
     * Constructor
     * 
     * @param name        name of the gun
     * @param sidearm     if the gun is a sidearm
     * @param cost        cost of the gun
     * @param automatic   firemode of the gun
     * @param reloadSpeed time it takes for reload
     * @param magazine    how many bullets in each magazine
     * @param reserve     how many bullets in reserve
     * @param fireRate    how many bullets the gun fires each second
     * @param headDmg     dmg of a headshot
     * @param bodyDmg     dmg of a bodyshot
     * @param legDmg      dmg of legshot
     */
    public Gun(String name, boolean sidearm, int cost, boolean automatic, double reloadSpeed, int magazine,
            int reserve, double fireRate, int headDmg, int bodyDmg, int legDmg) {

        this.name = name;
        this.sidearm = sidearm;
        this.cost = cost;
        this.automatic = automatic;
        this.reloadSpeed = reloadSpeed;
        this.magazine = magazine;
        this.reserve = reserve;
        this.fireRate = fireRate;
        this.headDmg = headDmg;
        this.bodyDmg = bodyDmg;
        this.legDmg = legDmg;
    }

    /*
     * Accessors
     */

    public boolean getSidearm() {
        return this.sidearm;
    }

    public int getCost() {
        return this.cost;
    }

    public double reloadSpeed() {
        return this.reloadSpeed;
    }

    public int magazine() {
        return this.magazine;
    }

    /*
     * Methods
     */

    /**
     * toString method
     * returns all the attributes of the gun in a String
     * 
     * @return gunString string containing the attributes of the human
     */
    public String toString() {
        String gunString = "";

        gunString = gunString + "Name: " + this.name + "\n";
        gunString = gunString + "Sidearm: " + this.sidearm + "\n";
        gunString = gunString + "Cost: $" + this.cost + "\n";
        gunString = gunString + "Automatic: " + this.automatic + "\n";
        gunString = gunString + "Reload Speed: " + this.reloadSpeed + "s\n";
        gunString = gunString + "Magazine: " + this.magazine + " rounds\n";
        gunString = gunString + "Reserve: " + this.reserve + " rounds\n";
        gunString = gunString + "Fire rate: " + this.fireRate + " rounds/s\n";
        gunString = gunString + "Head dmg: " + this.headDmg + "\n";
        gunString = gunString + "Body dmg: " + this.bodyDmg + "\n";
        gunString = gunString + "Leg dmg: " + this.legDmg + "\n";
        return gunString;
    }
}
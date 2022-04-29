import java.util.ArrayList;

/**
 * This is an example of a user's inventory
 * 
 * @author Yuting
 *         4/28/2022
 */
public class Inventory {

    /** The amount of valorant points the user has */
    int valPoint;

    /** The amount of radiant points the user has */
    int radPoint;

    /** The inventory of skins the user has */
    ArrayList<Skin> ownedSkins;

    /** The associated profile this inventory belongs to */
    UserProfile associatedUserProfile;

    // constructor

    /**
     * default constuctor
     */
    public Inventory() {
        this.valPoint = 0;
        this.radPoint = 0;
        this.ownedSkins = new ArrayList<Skin>();
    }

    /**
     * This is the constructor containing all the param needed for a complete
     * Inventory object
     * 
     * @param valPoint              the amount of valorant points the user has
     * @param radPoint              the amount of radiant points the user has
     * @param ownedSkins            the skins the user owns
     * @param associatedUserProfile the profile that owns this inventory
     */
    public Inventory(int valPoint, int radPoint, ArrayList<Skin> ownedSkins, UserProfile associatedUserProfile) {
        if (valPoint >= 0) {
            this.valPoint = valPoint;
        } else {
            this.valPoint = 0;
        }

        if (radPoint >= 0) {
            this.radPoint = radPoint;
        } else {
            this.radPoint = 0;
        }

        this.ownedSkins = ownedSkins;

    }

    // getters

    /**
     * gets the amount of valorant points this inventory has
     * 
     * @return valPoint the amount of valorant points the inventory has
     */
    public int getValPoint() {
        return this.valPoint;
    }

    /**
     * gets the amount of radiant points this inventory has
     * 
     * @return radPoint the amount of radiant points the inventory has
     */
    public int getRadPoint() {
        return this.radPoint;
    }

    public ArrayList<Skin> getOwnedSkin() {
        return this.ownedSkins;
    }

    public UserProfile getAssociatedUserProfile() {
        return this.associatedUserProfile;
    }
}

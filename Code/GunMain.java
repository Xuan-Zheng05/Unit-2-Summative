
/** 
* Name: Xuan
* Date: 04/28/2022
* Description: Main class demonstrating functionality of the Gun class
*/

import java.io.*;
import java.util.ArrayList;

public class GunMain {

    public static void main(String[] args) throws IOException {

        // initalizes test profile and test agent
        Agent neon = AgentMain.Neon();
        ArrayList<Skin> nauxzdSkins = new ArrayList<>();
        Inventory nauxzdInventory = new Inventory(500, 25, nauxzdSkins);
        UserProfile nauxzd = new UserProfile("nauxzd", neon, nauxzdInventory);

        // initalized gun with skin
        Skin none = new Skin("None", false, 0);
        Gun vandal = new Gun("Vandal", none, 2900, true, 2.5, 25, 25, 75, 9.75, 160, 40, 34);

        // shoot gun 5 times and prnt new ammo
        vandal.shoot(10);
        System.out.println(vandal.getMagazine());

        // reload gun
        vandal.reload();
        // print out toString method
        System.out.println(vandal.toString());

        // testing the changeSkin method
        Skin primeVandal = new Skin("Prime Vandal", true, 1775);
        vandal.changeSkin(primeVandal, nauxzd);
    }

    // initalized all of the gun to use in main
    public static Gun[] initalGuns() {
        Skin none = new Skin("None", false, 0);
        Gun classic = new Gun("Classic", none, 0, false, 1.75, 12, 12, 36, 6.75, 78, 26, 22);
        Gun spectre = new Gun("spectre,", none, 1600, true, 2.25, 30, 30, 90, 13.33, 78, 26, 22);
        Gun phantom = new Gun("Phantom", none, 2900, true, 2.5, 25, 25, 75, 9.75, 160, 40, 34);
        Gun vandal = new Gun("Vandal", none, 2900, true, 2.5, 30, 30, 90, 11, 156, 39, 33);
        Gun operator = new Gun("Operator}", none, 4700, false, 3.7, 5, 5, 10, 0.6, 255, 150, 120);
        Gun[] initalGuns = { classic, spectre, phantom, vandal, operator };
        return initalGuns;

    }

}

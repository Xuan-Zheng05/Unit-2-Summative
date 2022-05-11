
/** 
* Name: Xuan
* Date: 05/02/2022
*/

import java.util.*;
import java.io.*;

public class SkinMain {

    public static void main(String[] args) throws IOException {

        // test skin
        Skin primeVandal = new Skin("Prime Vandal", "Vandal", true, 1775);
        String skinString = primeVandal.toString();
        System.out.println(skinString);

        // test gun
        Skin none = new Skin("None", "Default", false, 0);
        Gun vandal = new Gun("Vandal", none, 2900, true, 2.5, 30, 30, 90, 11, 156, 39, 33);

        // initalizes profile and agent
        Agent neon = AgentMain.Neon();
        ArrayList<Skin> nauxzdSkins = new ArrayList<>();
        Inventory nauxzdInventory = new Inventory(500, 25, nauxzdSkins);
        UserProfile nauxzd = new UserProfile("nauxzd", neon, nauxzdInventory);

        // demonstrating checkApplyable and buySkin method
        primeVandal.buySkin(primeVandal, nauxzd);

        // checks if you can apply Prime Vandal skin to the Vandal gun
        if (primeVandal.checkApplyable(vandal)) {
            vandal.changeSkin(primeVandal, nauxzd);
        }
    }
}

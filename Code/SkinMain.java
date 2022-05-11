
/** 
* Name: Xuan
* Date: 05/02/2022
*/

import java.util.*;
import java.io.*;

public class SkinMain {

    public static void main(String[] args) throws IOException {

        // test skin
        Skin primeVandal = new Skin("Prime Vandal", true, 1775);
        String skinString = primeVandal.toString();

        // initalizes profile and agent
        Agent neon = AgentMain.Neon();
        ArrayList<Skin> nauxzdSkins = new ArrayList<>();
        Inventory nauxzdInventory = new Inventory(500, 25, nauxzdSkins);
        UserProfile nauxzd = new UserProfile("nauxzd", neon, nauxzdInventory);

        // demonstrating buySkin method
        primeVandal.buySkin(primeVandal, nauxzd);
        System.out.println(skinString);
    }
}

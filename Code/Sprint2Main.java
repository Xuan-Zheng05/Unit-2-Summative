import java.util.*;
import java.io.*;

/**
 * Names: Bonny, Xuan, Yifei, Yuting
 * Date: May 3rd, 2022
 * Description: Main class demonstrating functionality of the entire 2nd sprint
 */

public class Sprint2Main {

    // Main testing method
    public static void main(String[] args) {

        // initalized GameModes
        GameMode[] gameModeList = GameModeMain.initialGameModes();
        System.out.println("The gamemode is " + gameModeList[(int) Math.floor(Math.random() * 5)].getName());

        // initalized agent, skin, and gun
        Skin none = new Skin("None", false, 0);
        Skin reaverVandal = new Skin("Reaver Vandal", true, 1775);
        Gun vandal = new Gun("Vandal", none, 2900, true, 2.5, 25, 25, 75, 9.75, 160, 40, 34);
        Agent neon = AgentMain.Neon();
        Agent.changeWeapon (neon, vandal);

        // initalized skins array, inventory, and skins for one user
        ArrayList<Skin> nauxzdSkins = new ArrayList<>();
        nauxzdSkins.add(reaverVandal);
        Inventory nauxzdInventory = new Inventory(500, 25, nauxzdSkins);
        UserProfile nauxzd = new UserProfile("nauxzd",neon, nauxzdInventory);

        // printed out abilites of agent
        Ability[] abilities = neon.getAbility();
        for (int i = 0; i < 4; i++) {
        	
            System.out.println(abilities[i].getName());
            
        }
        
        System.out.println();

        // prints out all the attributes of a player
        System.out.println(nauxzd.toString());

    }

}

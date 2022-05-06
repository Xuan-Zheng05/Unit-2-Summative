import java.util.*;
import java.io.*;

/**
 * Names: Bonny, Xuan, Yifei, Yuting
 * Date: May 3rd, 2022
 * Description: Main class demonstrating functionality of the entire 3rd sprint
 */

public class Sprint3Main {

    // Main testing method
    public static void main(String[] args) {

        // initalized GameMode and Map for the current round
        GameMode[] gameModeList = GameModeMain.initialGameModes();
        System.out.println("The gamemode is " + gameModeList[(int) Math.floor(Math.random() * 5)].getName());
        Map[] mapList = MapMain.initalMaps();
        System.out.println("The Map is " + mapList[(int) Math.floor(Math.random() * 7)].getName());

        Gun[] initalGuns = GunMain.initalGuns();
        Gun classic = initalGuns[0];
        Gun spectre = initalGuns[1];
        Gun phantom = initalGuns[2];
        Gun vandal = initalGuns[3];
        Gun operator = initalGuns[4];

        // initalized agent, skin, and gun
        Skin none = new Skin("None", false, 0);
        Skin reaverVandal = new Skin("Reaver Vandal", true, 1775);
        Agent neon = AgentMain.Neon();
        neon.changeWeapon(vandal);
        neon.buyWeapon(spectre);

        // initalized skins array, inventory, and skins for one user
        ArrayList<Skin> nauxzdSkins = new ArrayList<>();
        nauxzdSkins.add(reaverVandal);
        Inventory nauxzdInventory = new Inventory(500, 25, nauxzdSkins);
        UserProfile nauxzd = new UserProfile("nauxzd", neon, nauxzdInventory);

        System.out.println();

        // prints out all the attributes of a player
        System.out.println(nauxzd.toString());

        neon.getGun().shoot(5);

    }

}

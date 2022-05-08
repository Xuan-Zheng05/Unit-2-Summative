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

        int newOrOld;
        String playerName = " ";         //find player's name;
        boolean ask = true;
        
        //Declare Scanner2
        Scanner sc = new Scanner(System.in);  

        System.out.println();      //blank line for spacing
        System.out.print("Please enter your name: ");
        playerName =sc.nextLine();

        System.out.println("\n| Welcome to Valorant |"+playerName);  

        System.out.println("are you a new player[1] or an old player[2]?");
        newOrOld = sc.nextInt();

        UserInterface.newOrOld(newOrOld, playerName);
        
        sc.close();
        // initalized GameModes
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

    }

}

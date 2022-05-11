
/**
 ____   ____  _       _____       ___   _______          _       ____  _____  _________  
|_  _| |_  _|/ \     |_   _|    .'   `.|_   __ \        / \     |_   \|_   _||  _   _  | 
  \ \   / / / _ \      | |     /  .-.  \ | |__) |      / _ \      |   \ | |  |_/ | | \_| 
   \ \ / / / ___ \     | |   _ | |   | | |  __ /      / ___ \     | |\ \| |      | |     
    \ ' /_/ /   \ \_  _| |__/ |\  `-'  /_| |  \ \_  _/ /   \ \_  _| |_\   |_    _| |_    
     \_/|____| |____||________| `.___.'|____| |___||____| |____||_____|\____|  |_____|    .java
 * 
 * Names: Bonny, Xuan, Yifei, Yuting
 * Date: May 3rd, 2022
 * Description: Main class demonstrating functionality of the entire 3rd sprint
 */
import java.util.*;
import java.io.*;

public class Sprint3Main {

    // Main testing method
    public static void main(String[] args) {

        int newOrOld;
        String playerName = " "; // find player's name;
        boolean ask = true;

        // Declare Scanner2
        Scanner sc = new Scanner(System.in);

        System.out.println(); // blank line for spacing
        System.out.print("Please enter your name: ");
        playerName = sc.nextLine();

        System.out.println("\n| Welcome to Valorant | " + playerName);

        do {

            try {

                System.out.println("are you a new player[1] or an old player[2]?");
                newOrOld = sc.nextInt();
                ask = UserInterface.newOrOld(newOrOld, playerName, ask);

            } catch (InputMismatchException e) {// if user did not enter integer

                System.out.println("You have entered invalid input, try again!");
                ask = true;

            }

        }

        while (ask);

        ask = true;
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

        // initalized 1st agent, skin, and gun
        Skin reaverVandal = new Skin("Reaver Vandal", true, 1775);
        Agent neon = AgentMain.Neon();
        neon.buyWeapon(spectre);
        neon.changeWeapon(vandal);

        // initalized skins array, inventory, and skins for one user
        ArrayList<Skin> nauxzdSkins = new ArrayList<>();
        nauxzdSkins.add(reaverVandal);
        Inventory nauxzdInventory = new Inventory(500, 25, nauxzdSkins);
        UserProfile nauxzd = new UserProfile("nauxzd", neon, nauxzdInventory);

        // changes skin of the gun
        neon.getGun().changeSkin(reaverVandal, nauxzd);

        // initalize 2nd agent. userprofile, and gun with default skin
        Agent viper = AgentMain.Viper();
        viper.buyWeapon(phantom);

        ArrayList<Skin> yifeiSkins = new ArrayList<>();
        Inventory yifeiInventory = new Inventory(500, 25, yifeiSkins);
        UserProfile yifei = new UserProfile("yifei", neon, yifeiInventory);

        // game start

        // neon shoots gun 3 times
        neon.getGun().shoot(6);
        // hit 3 times
        viper.bulletHit(neon.getGun(), neon, 2);
        System.out.println("Viper's current hp is " + viper.getAgentHp());

        viper.getGun().shoot(10);
        neon.bulletHit(viper.getGun(), viper, 5);

    }

}

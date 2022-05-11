/**
 * Names: Yifei Qi, Bonny Chen
 * Date: May.2th, 2022
 * Description: This program will initilzie the five gamemode in valorant (Unrated, Competitive, Spike rush, DeathMatch, Shooting test)
 * 
 */

import java.util.*;
import java.io.*;

public class GameModeMain {
    
    public static GameMode[] initialGameModes() {
        
        GameMode unrated = new GameMode("Unrated", 25, 10, false, true, false, true);
        GameMode competitive = new GameMode("Competitive", 25, 10, false, true, true, true);
        GameMode spikeRush = new GameMode("SpikeRush", 7, 10, true, false, false, false);
        GameMode deathMatch = new GameMode("Deathmatch", 1, 12, false, false, false, true);
        GameMode shootingTest = new GameMode("ShootingTest", 1, 100000, false, false, false, true);
        GameMode[] gameModeList = { unrated, competitive, spikeRush, deathMatch, shootingTest };
        return gameModeList;

       }

    public static void main(String[] args) throws IOException {
        
        // initalized GameModes
        GameMode[] gameModeList = GameModeMain.initialGameModes();
        String s = gameModeList[(int) Math.floor(Math.random() * 5)].getName();
        System.out.println("The gamemode is " + s);

        if (s.equals("deathMatch")) { 

            Ability.disableAbilities();
            System.out.println("Abilities are disabled.");

        }

        if (s.equals("spikeRush")) { 

            Gun.disableBuyGun();
            System.out.println("You cannot purchase a gun.");

        }

    }

}

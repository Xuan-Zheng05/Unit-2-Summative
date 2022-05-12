/**
 * Names: Bonny Chen
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
    
    // This demonstrates how GameMode relates to Ability and Gun and how Ability relates to GameMode and Agent
    public static void main(String[] args) throws IOException {

        // initalized GameModes
        GameMode[] gameModeList = GameModeMain.initialGameModes();
        String s = gameModeList[(int) Math.floor(Math.random() * 5)].getName();
        boolean canUse;
        System.out.println("The gamemode is " + s);

        if (s.equals("DeathMatch")) {

            canUse = false;
            Ability.disableAbilities();
            System.out.println("Abilities are disabled.");

        }

        if (s.equals("SpikeRush")) {

            Gun[] initalGuns = GunMain.initalGuns();
            for (int i = 0; i < initalGuns.length; i++) {

                initalGuns[i].disableBuy();

            }

            System.out.println("You cannot purchase a gun.");

        }
        
        // Initialize 2 agents
        Agent viper = AgentMain.Viper();
        Agent sage = AgentMain.Sage();

        sage.getAbility().useHealOrb(viper, canUse);

    }

}

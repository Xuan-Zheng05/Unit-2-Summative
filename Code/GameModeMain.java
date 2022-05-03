/**
 * Names: Yifei Qi
 * Date: May.2th, 2022
 * Description: This program will initilzie the five gamemode in valorant (Unrated, Competitive, Spike rush, DeathMatch, Shooting test)
 * 
 */

import java.util.*;
import java.io.*;

public class GameModeMain
{
    public static void main(String[] args) throws IOException 
    {
        GameMode unrated = new GameMode("Unrated",40,25,10,false,true,false);
        GameMode competitive = new GameMode("Competitive",40,25,10,false,true,true);
        GameMode spikeRush = new GameMode("SpikeRush",15,7,10,true,false,false);
        GameMode deathMatch = new GameMode ("DeathMatch",9,1,12,false,false,false);
        GameMode shootingTest = new GameMode("ShootingTest",100000,1,100000,false,false,false);
        GameMode[] gameModeList = {unrated,competitive,spikeRush,deathMatch,shootingTest};
    }
}
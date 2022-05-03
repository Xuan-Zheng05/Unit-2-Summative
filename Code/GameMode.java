/**
 * Names: Yifei Qi
 * Date: May.2th, 2022
 * Description: This program will include all gamemodes in valorant
 * May.2th - Unrated, Competitive, Spike rush, DeathMatch, Shooting test
 */

 public class GameMode 
 {

    /** can the gamemodes plantspike or not */
    private boolean canPlantSpike;

    /** can the gamemodes buy weapon or not*/
    private boolean canBuyWeapon;

    /** Whether the game is rated */
    private boolean ratedChecker;

    /** name of each gamemodes */
    private String name;

    /** total round counts in gamemodes */
    private int totalRoundCount;

    /** total players each gamemodes could have */
    private int totalPlayers;

    /** max time the gamemodes could have */
    private int times;

    /**
    * Constructor
    * 
    * @param name          name of the gamemode
    * @param times         Maximum Time the game will have (count in minutes)
    * @param totalPlayers  maximum player this gamemode will have (both team in total)
    * @param canPlantSpike whether the game can plant spike
    * @param canBuyWeapon  whether the game allows players to buy weapon
    * @param ratedChecker  checker to check whether the game is rated
    */

   public GameMode (String name, int times, int totalRoundCount, int totalPlayers, boolean canPlantSpike, boolean canBuyWeapon,boolean ratedChecker) 
   {

     this.name = name;
     this.times = times;
     this.totalRoundCount = totalRoundCount;
     this.totalPlayers = totalPlayers;
     this.canPlantSpike = canPlantSpike;
     this.canBuyWeapon = canBuyWeapon;
     this.ratedChecker = ratedChecker;
   }

   /*
    * Accessors
    */

   /**
    * Gets the GameMode name
    * 
    * @return the name of the Agent
    */

    public String getName()  {
   
        return this.name;
     
    }

    public int gettimes()  {
   
        return this.times;
     
    }

    public int gettotalRoundCount()  {
   
        return this.totalRoundCount;
     
    }

    public int getTotalPlayerCount()  {
   
        return this.totalPlayers;
     
    }
  
    public Boolean getSpikePlant()  {
   
        return this.canPlantSpike;
     
    }

    public Boolean getCanBuyWeapon()  {
   
        return this.canBuyWeapon;
     
    }
    

    public String toString() {
   
        String GameModeString = "";
     
        GameModeString = GameModeString + "Name: " + this.name + "\n";
        GameModeString = GameModeString + "times: " + this.times + "\n";
        GameModeString = GameModeString + "TotalRound: " + this.totalRoundCount + "\n";
        GameModeString = GameModeString + "Players: " + this.totalPlayers + "\n";
        GameModeString = GameModeString + "canPlantSpike: " + this.canPlantSpike + "\n";
        GameModeString = GameModeString + "canBuyWeapon: " + this.canBuyWeapon + "\n";
        return GameModeString;
    
     }
  
}

/**
 * Names: Yifei Qi
 * Date: May.2th, 2022
 * Description: This program will include all gamemodes in valorant
 * May.2th - Unrated, Competitive, Spike rush, DeathMatch, Shooting test
 * 
 */

 public class GameMode 
 {

    /** can the gamemodes plantspike or not */
    private boolean canPlantSpike;

    /** can the gamemodes buy weapon or not*/
    private boolean canBuyWeapon;

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
    * @param name           name of the agents
    * @param nation         nationality of the Agents
    * @param gun            the gun that the agent is using
    * @param AbilityOfAgent[] the four ability of agent
    */

   public GameMode (String name, int times, int totalRoundCount, int totalPlayers, boolean canPlantSpike, boolean canBuyWeapon) 
   {

     this.name = name;
     this.times = times;
     this.totalRoundCount = totalRoundCount;
     this.totalPlayers = totalPlayers;
     this.canPlantSpike = canPlantSpike;
     this.canBuyWeapon = canBuyWeapon;

   }

   /*
    * Accessors
    */

   /**
    * Gets the GameMode name
    * 
    * @return the name of the Agent
    */

    public String getName() 
    {
   
        return this.name;
     
    }

    public int gettimes() 
    {
   
        return this.times;
     
    }

    public int gettotalRoundCount() 
    {
   
        return this.totalRoundCount;
     
    }

    public int getTotalPlayerCount() 
    {
   
        return this.totalPlayers;
     
    }
  
    public Boolean getSpikePlant() 
    {
   
        return this.canPlantSpike;
     
    }

    public Boolean getCanBuyWeapon() 
    {
   
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
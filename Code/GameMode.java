/**
 * Names: Yifei Qi, Bonny Chen
 * Date: May 2nd, 2022 
 * Description: This program will include all gamemodes in valorant
 * May.2th - Unrated, Competitive, Spike rush, DeathMatch, Shooting test
 */

 public class GameMode {

    /** name of each gamemodes */
    private String name;

    /** total round counts in gamemodes */
    private int totalRoundCount;

    /** total players each gamemodes could have */
    private int totalPlayers;

     /** can the gamemodes plantspike or not */
     private boolean plantSpike;

     /** can the gamemodes buy weapon or not*/
     private boolean buyWeapon;
 
     /** if the game is competitive */
     private boolean ratedChecker;

     /** if you can use abilities */
     private boolean useAbilities;

    /**
     * Gamemode constructor
     * 
     * @param name
     * @param times
     * @param totalRoundCount
     * @param totalPlayers
     * @param plantSpike
     * @param buyWeapon
     * @param ratedChecker
     * @param useAbilities
     */
    public GameMode (String name, int totalRoundCount, int totalPlayers, boolean plantSpike, boolean buyWeapon, boolean ratedChecker, boolean useAbilities) {

     this.name = name;
     this.totalRoundCount = totalRoundCount;
     this.totalPlayers = totalPlayers;
     this.plantSpike = plantSpike;
     this.buyWeapon = buyWeapon;
     this.ratedChecker = ratedChecker;
     this.useAbilities = useAbilities;

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

    public int gettotalRoundCount()  {
   
        return this.totalRoundCount;
     
    }

    public int getTotalPlayerCount()  {
   
        return this.totalPlayers;
     
    }
  
    public Boolean getPlantSpike()  {
   
        return this.plantSpike;
     
    }

    public Boolean getBuyWeapon()  {
   
        return this.buyWeapon;
     
    }
    
    public String toString() {
   
        String GameModeString = "";
     
        GameModeString = GameModeString + "Name: " + this.name + "\n";
        GameModeString = GameModeString + "TotalRound: " + this.totalRoundCount + "\n";
        GameModeString = GameModeString + "Players: " + this.totalPlayers + "\n";
        GameModeString = GameModeString + "Plant Spike?: " + this.plantSpike + "\n";
        GameModeString = GameModeString + "Buy Weapon?: " + this.buyWeapon + "\n";
        GameModeString = GameModeString + "Use Abilities?: " + this.useAbilities + "\n";
        return GameModeString;
    
     }
  
}

/**
 * Names: Bonny Chen, Yifei Qi
 * Date: May 2nd, 2022
 * Description: This program will include all gamemodes in valorant
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

    /** can the gamemodes buy weapon or not */
    private boolean buyWeapon;

    /** if the game is competitive */
    private boolean ratedChecker;

    /** if you can use abilities */
    private boolean useAbilities;

    /**
     * Gamemode constructor
     * 
     * @param name
     * @param totalRoundCount
     * @param totalPlayers
     * @param plantSpike
     * @param buyWeapon
     * @param ratedChecker
     * @param useAbilities
     */
    public GameMode(String name, int totalRoundCount, int totalPlayers, boolean plantSpike,
            boolean ratedChecker, boolean useAbilities, boolean buyWeapon) {

        this.name = name;
        this.totalRoundCount = totalRoundCount;
        this.totalPlayers = totalPlayers;
        this.plantSpike = plantSpike;
        this.ratedChecker = ratedChecker;
        this.useAbilities = useAbilities;
        this.buyWeapon = buyWeapon;

    }

    /*
     * Accessors
     */

    /**
     * Gets the GameMode name
     * 
     * @return the name of the Agent
     */
    public String getName() {

        return this.name;

    }

    /**
     * Gets how many rounds there are
     *
     * @return the total round count
     */
    public int getTotalRoundCount() {

        return this.totalRoundCount;

    }

    /**
     * Gets how many players are in the game
     * 
     * @return the total number of players
     */
    public int getTotalPlayerCount() {

        return this.totalPlayers;

    }

    /**
     * Get if you can plant the spike in the gamemode
     * 
     * @return if you can plant spike
     */
    public Boolean getPlantSpike() {

        return this.plantSpike;

    }

    /**
     * Get if you can buy weapons in the gamemode
     * 
     * @return if you can buy weapons
     */
    public Boolean getBuyWeapon() {

        return this.buyWeapon;

    }

    /**
     * Displays all the attributes of the gamemode in a String
     * 
     * @return GameModeString with all the attributes of the gamemode
     */
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

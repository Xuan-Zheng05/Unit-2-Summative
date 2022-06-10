/**
 * Names: Bonny Chen Date: 
 * April 28th, 2022 
 * Description: The abilities class and all its attributes, accessors, and mutator methods
 */

public class Ability {

	/*
	 * Attributes
	 */

	/** name of the ability */
	private String name;

	/** cost of the ability */
	private int cost;

	/** amount of damage the ability does */
	private int damage;

	/** how many of the ability the agent has */
	private int amount;

	/** if the ability blinds */
	private boolean blind;

	/** if the ability slows */
	private boolean slow;

	/** if the ability concusses */
	private boolean concuss;

	/** if the ability cause health decay */
	private boolean decay;

	/** if the ability causes vulnerability */
	private boolean vulnerable;

	/** if the ability detects a presence */
	private boolean detect;

	/** if the ability pulls enemies in */
	private boolean pull;

	/** if the ability makes allie agents faster */
	private boolean speed;

	/** if the ability is an ultimate */
	private boolean isUltimate;

	/** if you can use abilities */
	private static boolean canUseAbilities;

	/**
	 * Constructor to create an ability
	 * 
	 * @param name:       name of the ability
	 * @param cost:       cost of the ability
	 * @param damage:     how much damage the ability does
	 * @param amount:     how many of the ability the agent has available to use
	 * @param blind:      if it blinds
	 * @param slow:       if it slows
	 * @param concuss:    if it concusses
	 * @param decay:      if it decays
	 * @param vulnerable: if it can make enemies vulnerable
	 * @param detect:     if it can detects enemies
	 * @param pull:       if it can pull enemies
	 * @param speed:      if it increase allies speed
	 * @param isUltimate: if this ability is an ultimate
	 */
	public Ability(String name, int cost, int damage, int amount, boolean blind, boolean slow, boolean concuss,
			boolean decay, boolean vulnerable, boolean detect, boolean pull, boolean speed, boolean isUltimate) {

		this.name = name;
		this.cost = cost;
		this.damage = damage;
		this.amount = amount;
		this.blind = blind;
		this.slow = slow;
		this.concuss = concuss;
		this.decay = decay;
		this.vulnerable = vulnerable;
		this.detect = detect;
		this.pull = pull;
		this.speed = speed;
		this.isUltimate = isUltimate;
		this.canUseAbilities = true;

	}

	/*
	 * Accessor Methods
	 */

	/**
	 * Get name of the ability
	 * 
	 * @return the name of the ability
	 */
	public String getName() {

		return this.name;

	}

	/**
	 * Get the cost of the ability
	 * 
	 * @return the cost of the ability
	 */
	public int getCost() {

		return this.cost;

	}

	/**
	 * Get how much damage the ability does
	 * 
	 * @return how much damage the ability does
	 */
	public int getDamage() {

		return this.damage;

	}

	/**
	 * Get the amount of abilities the agent has
	 * 
	 * @return the amount of abilities the agent has
	 */
	public int getAmount() {

		return this.amount;

	}

	/**
	 * Get if the ability can blind
	 * 
	 * @return if the ability blinds
	 */
	public boolean getBlind() {

		return this.blind;

	}

	/**
	 * Get if the ability can slow
	 * 
	 * @return if the ability slows
	 */
	public boolean getSlow() {

		return this.slow;

	}

	/**
	 * Get if the ability can concuss
	 * 
	 * @return if the ability concusses
	 */
	public boolean getConcuss() {

		return this.concuss;

	}

	/**
	 * Get if the ability can decay
	 * 
	 * @return if the ability causes decays
	 */
	public boolean getDecay() {

		return this.decay;

	}

	/**
	 * Get if the ability can make enemies vulnerable
	 * 
	 * @return if the ability causes vulnerability
	 */
	public boolean getVulnerable() {

		return this.vulnerable;

	}

	/**
	 * Get if the ability can detect enemies
	 * 
	 * @return if the ability detects enemies
	 */
	public boolean getDetect() {

		return this.detect;

	}

	/**
	 * Get if the ability can pull
	 * 
	 * @return if the ability pulls
	 */
	public boolean getPull() {

		return this.pull;

	}

	/**
	 * Get if the ability speeds agent(s) up
	 * 
	 * @return if the ability speeds agent(s) up
	 */
	public boolean getSpeed() {

		return this.speed;

	}

	/**
	 * Get if the ability is an ultimate
	 * 
	 * @return if the ability is an ultimate
	 */
	public boolean getUltimate() {

		return this.isUltimate;

	}

	/*
	 * Mutator Methods
	 */

	/**
	 * Sets all abilities to not able to be used
	 */
	public static void disableAbilities() {

		canUseAbilities = false;

	}

	/**
	 * Method for an agent to receive a heal orb
	 * 
	 * @param a: the agent getting healed
	 */
	public void useHealOrb(Agent a, boolean canUse) {

		if (canUse = true) {

			a.addAgentHp(60);

		} else {

			System.out.println("Can't use ability.");

		}

	}

	/**
	 * Method to use viper molly
	 * 
	 * @param a: the agent losing health
	 */
	public void useSnakeBite(Agent a, boolean canUse) {

		if (canUse = true) {

			a.subtractAgentHp(12);

		} else {

			System.out.println("Can't use ability.");

		}

	}

	/**
	 * Displays all the attributes of the ability in a String
	 * 
	 * @return abilityString with all the attributes of the ability
	 */
	public String toString() {

		String abilityString = "";

		abilityString = abilityString + "Name: " + this.name + "\n";
		abilityString = abilityString + "Cost: $" + this.cost + "\n";
		abilityString = abilityString + "Damage: " + this.damage + "\n";
		abilityString = abilityString + "Amount: " + this.amount + "\n";
		abilityString = abilityString + "Blinds: " + this.blind + "\n";
		abilityString = abilityString + "Slows: " + this.slow + "\n";
		abilityString = abilityString + "Concusses: " + this.concuss + "\n";
		abilityString = abilityString + "Decays: " + this.decay + "\n";
		abilityString = abilityString + "Enemies Vulnerable: " + this.vulnerable + "\n";
		abilityString = abilityString + "Detects Enemies: " + this.detect + "\n";
		abilityString = abilityString + "Pulls Enemies: " + this.pull + "\n";
		abilityString = abilityString + "Speeds Allies: " + this.speed + "\n";
		abilityString = abilityString + "Ultimate Ability: " + this.isUltimate + "\n";

		return abilityString;

	}

}

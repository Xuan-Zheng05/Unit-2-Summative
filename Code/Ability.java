/**
 * Names: Bonny Chen
 * Date: April 28th, 2022
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
	 */
	public Ability(String name, int cost, int damage, int amount, boolean blind, boolean slow, boolean concuss,
			boolean decay, boolean vulnerable, boolean detect) {

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

	}

	/*
	 * Accessor Methods
	 */

	public String getName() {

		return this.name;

	}

	public int getCost() {

		return this.cost;

	}

	public int getDamage() {

		return this.damage;

	}

	public int getAmount() {

		return this.amount;

	}

	public boolean getBlind() {

		return this.blind;

	}

	public boolean getSlow() {

		return this.slow;

	}

	public boolean getConcuss() {

		return this.concuss;

	}

	public boolean getDecay() {

		return this.decay;

	}

	public boolean getVulnerable() {

		return this.vulnerable;

	}

	public boolean getDetect() {

		return this.detect;

	}

	/*
	 * Methods
	 */

	/**
	 * Method to cast an ability
	 * 
	 * @param times: the number of times the ability is casted
	 */
	public void cast(int times) {

		this.amount -= times;

		if (this.amount < 0) {

			this.amount = 0;

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

		return abilityString;

	}

}

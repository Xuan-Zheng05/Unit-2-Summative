/**
 * Names: Bonny Chen
 * Date: May 2nd, 2022
 * Description: The abilities class and all its attributes, accessors, and
 * mutator methods
 */

public class Map {

	/*
	 * Attributes
	 */

	/** name of the map */
	private String name;

	/** if there is a teleporter on the map */
	private boolean teleporter;

	/** if there is a zipline on the map */
	private boolean zipline;

	/** if there is a sewer on the map */
	private boolean sewer;

	/** if there are ropes on the map */
	private boolean ropes;

	/** if there is a C Site */
	private boolean cSite;

	/** if you can control the doors (open and close them) */
	private boolean doorSwitch;

	/** if there is a chute */
	private boolean chute;

	/** if there is a dish */
	private boolean dish;

	/**
	 * Constructor to create a map
	 * 
	 * @param name:       name of the map
	 * @param teleporter: if there is a teleporter
	 * @param zipline:    if there is a zipline
	 * @param sewer:      if there is a sewer
	 * @param ropes:      if there are ropes
	 * @param cSite:      if there is a C Site
	 * @param doorSwitch: if there is a door switch
	 * @param chute:      if there is a chute
	 * @param dish:       if there is a dish
	 */
	public Map(String name, boolean teleporter, boolean zipline, boolean sewer, boolean ropes, boolean cSite,
			boolean doorSwitch, boolean chute, boolean dish) {

		this.name = name;
		this.teleporter = teleporter;
		this.zipline = zipline;
		this.sewer = sewer;
		this.ropes = ropes;
		this.cSite = cSite;
		this.doorSwitch = doorSwitch;
		this.chute = chute;
		this.dish = dish;

	}

	/*
	 * Accessor Methods
	 */

	public String getName() {

		return this.name;

	}

	public boolean getTeleporter() {

		return this.teleporter;

	}

	public boolean getZipline() {

		return this.zipline;

	}

	public boolean getSewer() {

		return this.sewer;

	}

	public boolean getRopes() {

		return this.ropes;

	}

	public boolean getCSite() {

		return this.cSite;

	}

	public boolean getdoorSwitch() {

		return this.doorSwitch;

	}

	public boolean getchute() {

		return this.chute;

	}

	public boolean getDish() {

		return this.dish;

	}

	/*
	 * Methods
	 */

	/**
	 * Displays all the attributes of the map in a String
	 * The attributes are the specific features of the map
	 * 
	 * @return mapString with all the attributes of the map
	 */
	public String toString() {

		String mapString = "";

		mapString = mapString + "Name: " + this.name + "\n";
		mapString = mapString + "Teleporter: " + this.teleporter + "\n";
		mapString = mapString + "Zipline: " + this.zipline + "\n";
		mapString = mapString + "Sewer: " + this.sewer + "\n";
		mapString = mapString + "Ropes: " + this.ropes + "\n";
		mapString = mapString + "C Site: " + this.cSite + "\n";
		mapString = mapString + "Close Door: " + this.doorSwitch + "\n";
		mapString = mapString + "chute: " + this.chute + "\n";
		mapString = mapString + "Dish: " + this.dish + "\n";

		return mapString;

	}

}

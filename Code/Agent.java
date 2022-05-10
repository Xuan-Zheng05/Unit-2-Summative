/**
 * Names: Yifei Qi
 * Date: April 28th, 2022
 * Description: This program will include all parts for agents in valorants
 * April.28.2022 - Added all attributes, accessors, and mutator methods
 * April.29.2022 - Fixed getAbility function, deleted duplicated accessors,
 * added comments
 * May.2.2022 - Rename the whole program to Agent, Add Hp and Armor check to
 * Attributes, fixed Comments
 * May.3.2022 - added default constructor with 0 credits at begining, added
 * change gun methods
 * May.6.2022 - added method to buy weapon with credits
 * May.8.2022 - added a defualt blank constructor, fixed comments
 * May.9.2022 - fixed comments
 */

public class Agent {

   /*
    * Attributes
    */

   /** name of the Agents */
   private String name;

   /** natioality of the Agents */
   private String nation;

   /** role of the Agents */
   static private String[] role = { "Controller", "Sentinel", "Initiator", "Duelist" };

   /** Guns of the Agents */
   private Gun gun;

   /** Hp of the Agents */
   private int agentHp;

   /** Abillities of the Agent */
   private Ability[] abilityOfAgent = new Ability[4];

   /** Whether the Agent has Armor or not */
   private Boolean hasArmor;

   /** amount of credits the agent has */
   private int credits;

   /*
    * Default constructor
    */

   public Agent() {

   }

   /**
    * Default Constructor with credis 0 at begining
    * 
    * @param name             name of the agents
    * @param nation           nationality of the Agent
    * @param gun              the gun that the Agent is using
    * @param AbilityOfAgent[] the four ability of agent
    * @param hasArmor         Checker to check whether the Agent has Armor
    */

   public Agent(String name, String nation, String role, Gun gun, Ability abilityOfAgent[], Boolean hasArmor) {
      this.name = name;
      this.nation = nation;
      this.role[0] = role;
      this.gun = gun;
      for (int i = 0; i < 4; i++) {
         this.abilityOfAgent[i] = abilityOfAgent[i];
      }
      this.hasArmor = hasArmor;
      if (this.hasArmor) {
         this.agentHp = 150;
      } else {
         this.agentHp = 100;
      }
      this.credits = 3000;
   }

   /**
    * Constructor
    * 
    * @param name             name of the agents
    * @param nation           nationality of the Agent
    * @param gun              the gun that the Agent is using
    * @param AbilityOfAgent[] the four ability of agent
    * @param hasArmor         Checker to check whether the Agent has Armor
    */

   public Agent(String name, String nation, String role, Gun gun, Ability abilityOfAgent[], Boolean hasArmor,
         int credits) {
      this.name = name;
      this.nation = nation;
      this.role[0] = role;
      this.gun = gun;
      for (int i = 0; i < 4; i++) {
         this.abilityOfAgent[i] = abilityOfAgent[i];
      }
      this.hasArmor = hasArmor;
      if (this.hasArmor) {
         this.agentHp = 150;
      } else {
         this.agentHp = 100;
      }
      this.credits = credits;
   }

   /*
    * Accessors
    */

   /**
    * Gets the Agent name
    * 
    * @return the name of the Agent
    */

   public String getName() {

      return this.name;

   }

   /**
    * Gets the Agent nationality
    * 
    * @return the nationality of the Agent
    */

   public String getNation() {

      return this.nation;

   }

   /**
    * Gets the Agent hp
    * 
    * @return the hp of the Agent
    */

   public int getAgentHp() {

      return this.agentHp;

   }

   /**
    * Gets the type of the agent
    * 
    * @return the type of the Agent
    */

   public String getRole() {

      return this.role[0];

   }

   static public String[] getRoleArray() {
      return role.clone();
   }

   /**
    * Gets the abilitys of the agent
    * 
    * @return the abilitys of the Agent
    */

   public Ability[] getAbility() {

      Ability[] agentAbility = new Ability[4];

      for (int i = 0; i < 4; i++) {

         agentAbility[i] = this.abilityOfAgent[i];

      }

      return agentAbility;
   }

   /**
    * Gets the gun of the agent
    * 
    * @return the gun of the Agent
    */

   public Gun getGun() {

      return this.gun;
   }

   /**
    * Check whether the agent have armor
    * 
    * @return the armor check of the Agent
    */

   public Boolean getHasArmor() {

      return this.hasArmor;
   }

   /**
    * Gets the amount of credits of the agent
    * 
    * @return the amount of credits
    */

   public int getCredits() {

      return this.credits;

   }

   /*
    * Mutator
    */

   /**
    * changes the weapon of the agent
    * 
    * @param gun the gun being changed to
    */

   public void changeWeapon(Gun gun) {
      this.gun = gun;
   }

   /**
    * agent buys a gun and credits are subtracted from the cost of the gun
    * 
    * @param gun the gun being bought
    */

   public void buyWeapon(Gun gun) {
      this.gun = gun;
      this.credits = this.credits - gun.getCost();
   }

   /**
    * set the agents credits to a new value
    * 
    * @param credis the new credits the agent will have
    */
   public void changeCredit(int credits) {
      this.credits = credits;
   }

   /*
    * Methods
    */

   /**
    * Wears the armor for agent, set wearArmor = true
    * 
    * @return hasArmor checker to check whether the agent wears armor
    */

   public Boolean wearArmor() {
      hasArmor = true;
      return hasArmor;
   }

   /**
    * remove the armor for the agent if it has one
    * 
    * @return hasArmor checker to check whether the agent wears armor
    */

   public Boolean removeArmor() {
      if (hasArmor == true) {
         hasArmor = false;
      }
      return hasArmor;
   }

   /**
    * Bullet hits agent, subtracts body dmg of gun from agentHp
    * if agentHp reaches 0, print out (agentName) is dead
    * 
    * @param gun   the gun the bullet was shot from
    * @param agent the agent that was hit
    * @param times the number of times the agent of hit
    */
   public void bulletHit(Gun gun, Agent agent, int times) {
      this.agentHp -= gun.getBodyDmg() * times;
      if (agentHp <= 0) {
         System.out.println(this.name + " is dead");
      }
   }

   /**
    * Displays all the attributes of the ability in a String
    * 
    * @return agentString with all the attributes of the ability
    */

   public String toString() {

      String agentString = "";

      agentString = agentString + "Name: " + this.name + "\n";
      agentString = agentString + "Nation: " + this.nation + "\n";
      agentString = agentString + "Role: " + this.role[0] + "\n";
      agentString = agentString + "Gun: " + this.gun.getName() + "\n";

      for (int i = 0; i < 3; i++) {

         agentString = agentString + "Ability " + (i + 1) + ": " + this.abilityOfAgent[i].getName() + "\n";

      }

      agentString = agentString + "Ultimate: " + this.abilityOfAgent[3].getName() + "\n";
      agentString = agentString + "Credits: " + this.credits + "\n";
      return agentString;

   }

}
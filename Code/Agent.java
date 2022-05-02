/**
 * Names: Yifei Qi
 * Date: April 28th, 2022
 * Description: This program will include all parts for agents in valorants
 * April.28.2022 - Added all attributes, accessors, and mutator methods
 * April.29.2022 - Fixed getAbility function, deleted duplicated accessors, added comments
 * May.2.2022 - Rename the whole program to Agent, Add 
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

   /** Abillities of the Agents */
   private Ability[] abilityOfAgent = new Ability[4];

   /**
    * Constructor
    * 
    * @param name           name of the agents
    * @param nation         nationality of the Agent
    * @param agentHp        Hps of the Agent
    * @param gun            the gun that the Agent is using
    * @param AbilityOfAgent[] the four ability of agent
    */

   public Agent(String name, String nation, int agentHp, String role, Gun gun, Ability abilityOfAgent[]) {
      this.name = name;
      this.nation = nation;
      this.role[0] = role;
      this.gun = gun;
      for (int i = 0; i < 4; i++) {
         this.abilityOfAgent[i] = abilityOfAgent[i];     
      }
   
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
    * Gets the Agent nationality
    * 
    * @return the nationality of the Agent
    */

   public String getNation() {
   
      return this.nation;
   
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
   public Gun gun() 
   {
   
      return this.gun;
   }

   /*
    * Mutator
    */



   /*
    * Methods
    */

   /**
    * Displays all the attributes of the ability in a String
    * 
    * @return abilityString with all the attributes of the ability
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
      return agentString;
   
   }

}
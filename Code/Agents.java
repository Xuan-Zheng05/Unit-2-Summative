/**
 * Names: Yifei Qi
 * Date: April 28th, 2022
 * Description: This program will include all parts for agents in valorants
 * April.28.2020
 * - Added all attributes,accessors, and mutator methods
 */

public class Agents {

   /*
    * Attributes
    */

   /** name of the Agents */
   private String name;

   /** natioality of the Agents */
   private String nation;

   /** Type of the Agents */
   static private String[] type = { "Controller", "Sentinel", "Initiator", "Duelist" };

   /** Guns of the Agents */
   private Gun gun;

   /** Abillities of the Agents */
   private Ability[] AbilityOfAgent = new Ability[4];

   /**
    * Constructor
    * 
    * @param name           name of the agents
    * @param nation         nationality of the Agents
    * @param gun            the gun that the agent is using
    * @param AbilityOfAgent the four ability of agent
    */

   public Agents(String name, String nation, String type, Gun gun, Ability AbilityOfAgent[]) {
      this.name = name;
      this.nation = nation;
      this.type[0] = type;
      this.gun = gun;
      for (int i = 0; i < 4; i++) {
         this.AbilityOfAgent[i] = AbilityOfAgent[i];
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
    * Gets the Agent nationality
    * 
    * @return the nationality of the Agent
    */

   public String getType() {
      return this.type[0];
   }

   static public String[] getTypeArray() {
      return type.clone();
   }

   /**
    * Gets the type of the agent
    * 
    * @return the type of the Agent
    */

   public String getNation() {
      return this.nation;
   }

   /**
    * Gets the array abilitys of the agent
    * 
    * @return the abilitys of the Agent
    */

   public Ability[] getAbilityArray() {
      return AbilityOfAgent.clone();
   }

   /**
    * Gets the abilitys of the agent
    * 
    * @return the abilitys of the Agent
    */

   public Ability getAbility() {
      Ability AgentAbility = new Ability("", 0, 0, false, false, false, false, false, false);
      for (int i = 0; i < 4; i++) {
         AgentAbility = this.AbilityOfAgent[i];
      }

      return AgentAbility;
   }

   /*
    * mutator
    */

   public Gun gun() {
      return this.gun;
   }

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
      agentString = agentString + "Type: " + this.type[0] + "\n";
      agentString = agentString + "Guns: " + this.gun + "\n";
      for (int i = 0; i < 4; i++) {
         agentString = agentString + "Ability: " + this.AbilityOfAgent[i] + "\n";
      }
      return agentString;
   }
}
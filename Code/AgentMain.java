
/**
 * Name: Yifei
 * Date: 04/28/2022
 * Description: Main class demonstrating functionality of the Agent class
 */

public class AgentMain {

   // Main testing method
   public static void main(String[] args) {

      String[] type = Agent.getRoleArray();

      Ability slowOrb = new Ability("Slow Orb", 200, 0, 2, false, true, false, false, false, false);
      Ability test1 = new Ability("test1", 200, 0, 2, false, true, false, false, false, false);
      Ability test2 = new Ability("test2", 200, 0, 2, false, true, false, false, false, false);
      Ability resurrection = new Ability("Resurection", 0, 0, 2, false, true, false, false, false, false);
      Ability[] abilityOfAgent = { slowOrb, test1, test2, resurrection };
      Skin none = new Skin("None", false, 0);
      Gun vandal = new Gun("Vandal", none, 2900, true, 2.5, 25, 25, 75, 9.75, 160, 40, 34);
      Agent Neon = new Agent("Neon", "US", type[1], vandal, abilityOfAgent, true, 2000);

      Ability[] abilities = Neon.getAbility();
      for (int i = 0; i < 4; i++) {
         System.out.println(abilities[i].getName());
      }
      System.out.println(Neon.toString());

   }

}

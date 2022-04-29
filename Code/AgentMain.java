
/** 
*   Name: Yifei
*   Date: 04/28/2022
*
*   Description: 
*   Main class demonstrating functionality of the Agent class
*/

public class AgentMain {



   //Main testing method
   public static void main(String[] args) 
   {  
      String[] type = Agents.getTypeArray();
      Ability slowOrb = new Ability("Slow Orb", 200, 0, false, true, false, false, false, false);
      Ability test1 = new Ability("test1", 200, 0, false, true, false, false, false, false);
      Ability test2 = new Ability("test2", 200, 0, false, true, false, false, false, false);
      Ability test3 = new Ability("test3", 200, 0, false, true, false, false, false, false);
      Ability[] AbilityOfAgent = {test1,test2,test3,slowOrb}; 
      Gun vandal = new Gun("Vandal", 2900, true, 2.5, 25, 75, 9.75, 160, 40, 34);
      Agents Neon = new Agents ("Neon","US",type[1],vandal,AbilityOfAgent);
      System.out.println(Neon.toString());
   }
}
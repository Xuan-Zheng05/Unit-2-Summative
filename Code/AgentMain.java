

/**
 * Name: Yifei
 * Date: 04/28/2022
 * Description: Main class demonstrating functionality of the Agent class
 */

public class AgentMain {
	
   /* default gun for agent*/
   static Skin none = new Skin("None", false, 0);
   static Gun classic = new Gun("classic", none, 0, false, 1.75, 12, 12, 36, 6.75, 78, 26, 22);
   static String[] role = Agent.getRoleArray(); /* "Controller", "Sentinel", "Initiator", "Duelist"*/

   public static Agent nullAgent(){
      Agent nullAgent = new Agent();
      return nullAgent;
   }
   public static Agent Astra() {
   
      Agent astra = new Agent ("Astra","Ghana",role[0],classic,AbilityMain.astra(),false);
      return astra;
   
   }

   public static Agent BrimeStone() {
   
      Agent brimestone = new Agent ("Brimestone","Us",role[0],classic,AbilityMain.brimstone(),false);
      return brimestone;
      
   }

   public static Agent Viper() {
	   
      Agent viper = new Agent ("Viper","Us",role[0],classic,AbilityMain.viper(),false);
      return viper;
      
   }

   public static Agent Omen() {
   
      Agent omen = new Agent ("Omen","Unknown",role[0],classic,AbilityMain.omen(),false);
      return omen;
      
   }

   public static Agent Killjoy() {
   
      Agent killjoy = new Agent ("Killjoy","Germany",role[1],classic,AbilityMain.killjoy(),false);
      return killjoy;
      
   }

   public static Agent Cypher() {
	   
      Agent cypher = new Agent ("Cypher","Morroco",role[1],classic,AbilityMain.cypher(),false);
      return cypher;
      
   }

   public static Agent Sova() {
	   
      Agent sova = new Agent ("Sova","Russia",role[2],classic,AbilityMain.sova(),false);
      return sova;
      
   }

   public static Agent Sage() {
	   
      Agent sage = new Agent ("Sage","China",role[1],classic,AbilityMain.sage(),false);
      return sage;
      
   }

   public static Agent Phoneix() {
	   
      Agent phoneix = new Agent ("Phoneix","United Kingdom",role[3],classic,AbilityMain.phoenix(),false);
      return phoneix;
      
   }

   public static Agent Jett() {
	   
      Agent jett = new Agent ("Jett","South Korea",role[3],classic,AbilityMain.jett(),false);
      return jett;
      
   }

   public static Agent Reyna() {
	   
      Agent reyna = new Agent ("Reyna","Mexico",role[3],classic,AbilityMain.reyna(),false);
      return reyna;
      
   }

   public static Agent Raze() {
	   
      Agent raze = new Agent ("Raze","Brazil",role[3],classic,AbilityMain.raze(),false);
      return raze;
      
   }

   public static Agent Breach() {
	   
      Agent breach = new Agent ("Breach","Sweden",role[2],classic,AbilityMain.breach(),false);
      return breach;
      
   }

   public static Agent Skye() {
	   
      Agent skye = new Agent ("Skye","Australia",role[2],classic,AbilityMain.skye(),false);
      return skye;
      
   }

   public static Agent Yoru() {
	   
      Agent yoru = new Agent ("Yoru","Japan",role[2],classic,AbilityMain.yoru(),false);
      return yoru;
      
   }

   
   public static Agent KAYO() {
	   
      Agent kayo = new Agent ("KAY/O","Alternate",role[2],classic,AbilityMain.kayo(),false);
      return kayo;
      
   }
   

   public static Agent Chamber() {
     Agent chamber = new Agent ("Chamber","France",role[1],classic,AbilityMain.chamber(),false);
     return chamber;
     
   }

   public static Agent Neon() {
	   
     Agent neon = new Agent ("Neon","Philippines",role[3],classic,AbilityMain.neon(),false);
     return neon;
     
   }

   public static Agent Fade() {
	   
     Agent fade = new Agent ("Fade","Turkey",role[2],classic,AbilityMain.fade(),false);
     return fade;
     
   }
   public static Agent[] List()
   {
      Agent[] AgentList = new Agent[]{Astra(),BrimeStone(),Viper(),Cypher(),Sova(),Sage(),Phoneix(),Jett(),Reyna(),Raze(),Breach(),Skye(),Yoru(),KAYO(),Chamber(),Neon(),Fade()};
      return AgentList;
   }

   public static Agent getAgent(String agentName) {
      
      String curr;
      Agent[] currAgent = {Astra()};
      Agent[] AgentList = AgentMain.List();
        for (int i = 0; i < AgentList.length; i++) {

            curr = AgentList[i].getName();

            if (curr.equals(agentName)) {
               currAgent[0] = AgentList[i];
            }
        }

        return currAgent[0];
  }

  public static void main(String[] args) {

   Gun vandal = new Gun("Vandal", none, 2900, true, 2.5, 30, 30, 90, 11, 156, 39, 33);
   Agent neon = Neon();
   neon.changeWeapon(vandal);
   neon.buyWeapon(vandal);

   Ability[] abilities = neon.getAbility();
   for (int i = 0; i < 4; i++) {
      System.out.println(abilities[i].getName());
   }
   System.out.println(neon.toString());

   }
}

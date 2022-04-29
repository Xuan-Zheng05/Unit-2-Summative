
/**
 * Name: Yifei
 * Date: 04/28/2022
 * Description: Main class demonstrating functionality of the Agent class
 */

public class Sprint1Main {

    // Main testing method
    public static void main(String[] args) {

        // initalized abilities
        Ability slowOrb = new Ability("Slow Orb", 200, 0, 2, false, true, false, false, false, false);
        Ability test1 = new Ability("test1", 200, 0, 2, false, true, false, false, false, false);
        Ability test2 = new Ability("test2", 200, 0, 2, false, true, false, false, false, false);
        Ability resurrection = new Ability("Resurection", 0, 0, 2, false, true, false, false, false, false);
        Ability[] abilityOfAgent = { slowOrb, test1, test2, resurrection };

        // initalized agent and gun
        Gun vandal = new Gun("Vandal", 2900, true, 2.5, 25, 25, 75, 9.75, 160, 40, 34);
        String[] role = Agents.getRoleArray();
        Agents neon = new Agents("Neon", "US", role[1], vandal, abilityOfAgent);

        // initalized user profile
        UserProfile nauxzd = new UserProfile("nauxzd", neon);

        // printed out abilites of agent
        Ability[] abilities = neon.getAbility();
        for (int i = 0; i < 4; i++) {
            System.out.println(abilities[i].getName());
        }
        System.out.println();

        // prints out all the attributes of a player
        System.out.println(nauxzd.toString());

    }

}

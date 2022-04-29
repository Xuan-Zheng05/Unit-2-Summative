/*
 * Names: Bonny Chen 
 * Date: April 28th, 2022 
 * Description: Class to call the abilities
 */

import java.io.*;

public class AbilityMain {

        public static void main(String[] args) throws IOException {

                Ability slowOrb = new Ability("Slow Orb", 200, 0, 2, false, true, false, false, false, false);

                System.out.println(slowOrb.toString());

        }

}

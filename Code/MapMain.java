/**
 * Names: Bonny Chen 
 * Date: May 2nd, 2022 
 * Description: Class to call the Maps
 */

import java.io.*;

public class MapMain {

	public static void main(String[] args) throws IOException {

		Map ascent = new Map("Ascent", false, false, false, false, false, true, false, false);
		System.out.println(ascent.toString());
		
		Map haven = new Map("Haven", false, false, false, false, true, false, false, false);
		System.out.println(haven.toString());
		
		Map fracture = new Map("Fracture", false, true, false, true, false, false, false, true);
		System.out.println(fracture.toString());

	}

}
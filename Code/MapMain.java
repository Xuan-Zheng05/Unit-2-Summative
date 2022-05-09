/**
 * Names: Bonny Chen 
 * Date: May 2nd, 2022 
 * Description: Class to call the Maps
 */

import java.io.*;

public class MapMain {

	public static void main(String[] args) throws IOException {

	}

	public static Map[] initalMaps() {
		
		Map ascent = new Map("Ascent", false, false, false, false, false, true, false, false);
		Map haven = new Map("Haven", false, false, false, false, true, false, false, false);
		Map fracture = new Map("Fracture", false, true, false, true, false, false, false, true);
		Map icebox = new Map("Icebox", false, true, false, true, false, false, false, false);
		Map breeze = new Map("Breeze", false, false, false, true, false, true, true, false);
		Map bind = new Map("Bind", true, false, false, false, false, false, false, false);
		Map split = new Map("Split", false, false, true, true, false, false, false, false);
		Map[] mapList = { ascent, haven, fracture, icebox, breeze, bind, split };
		return mapList;
		
	}

}

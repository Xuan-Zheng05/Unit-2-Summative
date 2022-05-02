
/** 
* Name: Xuan
* Date: 04/28/2022
* Description: Main class demonstrating functionality of the Gun class
*/

import java.util.*;
import java.io.*;

public class GunMain {

    public static void main(String[] args) throws IOException {

        // initalized gun
        Gun vandal = new Gun("Vandal", 2900, true, 2.5, 25, 25, 75, 9.75, 160, 40, 34);

        // print out toString method
        System.out.println(vandal.toString());

        // shoot gun 5 times and see new ammo
        vandal.shoot(5);

    }

}

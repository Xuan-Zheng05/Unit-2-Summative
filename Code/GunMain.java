
/** 
*   Name: Xuan
*   Date: 04/28/2022
*
*   Description: 
*   Main class demonstrating functionality of the Gun class
*/

import java.util.*;
import java.io.*;

public class GunMain {
    public static void main(String[] args) throws IOException {
        Gun Vandal = new Gun("Vandal", false, 2900, true, 2.5, 25, 75, 9.75, 160, 40, 34);

        System.out.println(Vandal.toString());
    }
}
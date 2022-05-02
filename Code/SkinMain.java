
/** 
* Name: Xuan
* Date: 05/02/2022
*/

import java.util.*;
import java.io.*;

public class SkinMain {

    public static void main(String[] args) throws IOException {

        Gun vandal = new Gun("Vandal", 2900, true, 2.5, 25, 25, 75, 9.75, 160, 40, 34);
        Skin primeVandal = new Skin("Prime Vandal", vandal, true, 1775);

        String skinString = primeVandal.toString();
        System.out.println(skinString);
    }
}

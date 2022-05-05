
/** 
* Name: Xuan
* Date: 05/02/2022
*/

import java.util.*;
import java.io.*;

public class SkinMain {

    public static void main(String[] args) throws IOException {

        Skin primeVandal = new Skin("Prime Vandal", true, 1775);
        String skinString = primeVandal.toString();
        System.out.println(skinString);
    }
}

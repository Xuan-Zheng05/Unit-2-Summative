import java.util.*;
import java.io.*;

/**
 * Names: Bonny, Xuan, Yifei, Yuting
 * Date: May 6th, 2022
 * Description: Userinterface methods
 */

public class UserInterface {
   int newOrOld;

   public static boolean newOrOld(int newOrOld, String playerName, boolean ask) {
      String fileName = playerName + ".txt";
      int AgentChoice = 0, settingChoice = 0;

      Scanner sc = new Scanner(System.in);
      try {
         if (newOrOld == 1) {
            ask = false;
            // create the file
            UserProfile playerProfile = new UserProfile(playerName);
            UserSetting playerSetting = new UserSetting();
            System.out.println(
                  "Looks like you are new to the game, do you want to choose your first agent from the five default agents?");
            System.out.println("Please choose between [1]Brimstone, [2]Jett, [3]Phoenix, [4]Sage, and [5]Sova");
            AgentChoice = sc.nextInt();
            if (AgentChoice == 1) {
               playerProfile.changeAgent(AgentMain.BrimeStone());
            } else if (AgentChoice == 2) {
               playerProfile.changeAgent(AgentMain.Jett());
            } else if (AgentChoice == 3) {
               playerProfile.changeAgent(AgentMain.Phoneix());
            } else if (AgentChoice == 4) {
               playerProfile.changeAgent(AgentMain.Sage());
            } else if (AgentChoice == 5) {
               playerProfile.changeAgent(AgentMain.Sova());
            }

            System.out.println(
                  "Looks like you are new to the game, do you want to use the [1]default user setting or [2]modify your self?");
            settingChoice = sc.nextInt();
            if (settingChoice == 1) {
               playerProfile.changeUserSetting(playerSetting);
            } else if (settingChoice == 2) {
               playerProfile.changeUserSetting(playerSetting); // not implemented yet
            } else {
               System.out.println("Please enter either 1 or 2 to continue, try again!");
            }

            writeFile(fileName, playerProfile, ask);
         } else if (newOrOld == 2) {
            ask = false;
            // check returning player file and print stats
            UserProfile playerProfile = returningPlayer(playerName, ask);
            if (ask = false) {
               System.out.println("Welcome back " + playerName + " Here is your current stats : ");
               System.out.println(playerProfile.toString());
            }

         } else {
            System.out.println("Please enter either 1 or 2 to continue, try again!");
         }
      } catch (InputMismatchException e) // if user did not enter integer
      {
         System.out.println("You have entered invalid input, try again!");
         ask = true;
      }
      sc.close();
      return ask;
   }

   public static void writeFile(String name, UserProfile playerProfile, boolean ask) {
      try {
         // Create a buffered writer using a file wruter
         BufferedWriter playerOut = new BufferedWriter(new FileWriter(name, false));

         // write player profile lines
         playerOut.write(playerProfile.toString());

         playerOut.close();
      } catch (IOException e) {
         System.out.println("There was a problem creating the file, please try again");
         ask = false;
      }
   }

   public static UserProfile returningPlayer(String name, boolean ask) {
      // Create a file using a file buffered reader
      String lineIn;
      String fileName = name + ".txt";
      UserProfile playerProfile = new UserProfile(name);
      Inventory playerInventory = new Inventory();
      UserSetting playerSetting = new UserSetting();
      BufferedReader inputIn;

      try {
         inputIn = new BufferedReader(new FileReader(fileName));
         lineIn = inputIn.readLine();
         playerProfile.changeUsername(lineIn);
         lineIn = inputIn.readLine();
         playerProfile.changeAgent(AgentMain.getAgent(lineIn));

         lineIn = inputIn.readLine();
         playerInventory.setValPoint(Integer.parseInt(lineIn));
         lineIn = inputIn.readLine();
         playerInventory.setRadPoint(Integer.parseInt(lineIn));
         playerProfile.changeUserSetting(playerSetting);

         lineIn = inputIn.readLine();
         playerSetting.changeResoulution(Integer.parseInt(lineIn));
         lineIn = inputIn.readLine();
         playerSetting.changeVolume(Integer.parseInt(lineIn));
         lineIn = inputIn.readLine();
         playerSetting.changeRatio(Double.parseDouble(lineIn));
         playerProfile.changeInventory(playerInventory);
      } catch (NumberFormatException e) {
         System.out.println("There was a problem with collecting the values, please try again.");
         ask = true;
      }

      catch (IOException e) {
         System.out.println("The file is not found, make sure the name you entered was correct");
         ask = true;
      }

      return playerProfile;
   }
}
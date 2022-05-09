import java.util.*;
import java.io.*;

/**
 * Names: Bonny, Xuan, Yifei, Yuting
 * Date: May 6th, 2022
 * Description: Userinterface methods
 */

 public class UserInterface
 {
    int newOrOld;

     public static void newOrOld (int newOrOld, String playerName)
     {
      String fileName = playerName + ".txt";
      int printChecker;
      String AgentChoice = " ";
      Scanner sc = new Scanner(System.in); 

         try{
            if (newOrOld == 1)
            {
               System.out.println("Looks like you are new to the game, do you want to choose your first agent from the five default agents?");
               System.out.println("Please choose between Brimstone, Jett, Phoenix, Sage, and Sova"); //this part doesnt really work yet
               AgentChoice = sc.nextLine();
               //create the file 
               UserProfile playerProfile = new UserProfile(playerName);
               writeFile(fileName,playerProfile);
            }
            else if (newOrOld == 2)
            {
               //check returning player file and print stats
               UserProfile playerProfile = returningPlayer(playerName);
               System.out.println("Welcome back "+playerName+ " Here is your current stats : "); 
               System.out.println(playerProfile.toString());     
            }
            else
            {
               System.out.println("Please enter either 1 or 2 to continue, try again!");
            }    
         }   
         catch (InputMismatchException e) //if user did not enter integer
         {
            System.out.println("You have entered invalid input, try again!"); 
         }
     } 

     public static void writeFile (String name, UserProfile playerProfile)
     {
        try
        {
           // Create a buffered writer using a file wruter
           BufferedWriter playerOut = new BufferedWriter (new FileWriter (name, false)); 
        
           //write player profile lines 
           playerOut.write(playerProfile.toString());
           
           playerOut.close();
        }
        catch (IOException e)
        {
           System.out.println("There was a problem creating the file, please try again");
        }
     }

     public static UserProfile returningPlayer (String name)
     {
        // Create a file  using a file reader
        Scanner statsFs = new Scanner(System.in); 
        String lineIn;
        String fileName = name + ".txt";
        int lineInt;
        UserProfile playerProfile = new UserProfile(name);
        Inventory playerInventory = new Inventory();
        BufferedReader inputIn;
        
        try
        {
           inputIn = new BufferedReader(new FileReader(fileName));
               lineIn = inputIn.readLine();
               playerProfile.changeUsername(lineIn);
               lineIn = inputIn.readLine();
               playerProfile.changeAgent(AgentMain.getAgent(lineIn));
               lineIn = inputIn.readLine();

               playerInventory.setValPoint(Integer.parseInt(lineIn));
               lineIn = inputIn.readLine();
               playerInventory.setRadPoint(Integer.parseInt(lineIn));
               playerProfile.changeInventory(playerInventory);
        }
        catch (NumberFormatException e) 
        {
           System.out.println("There was a problem with collecting the values, please try again.");
        }
        
        catch (IOException e)
        {
           System.out.println("The file is not found, make sure the name you entered was correct");
        }

      return playerProfile;
      }
 }
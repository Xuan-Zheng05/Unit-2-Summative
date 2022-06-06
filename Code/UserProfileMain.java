/**
 * This is a demonstration of the Userprofile and Inventory class
 * 
 * @author Yuting Hou
 *         5/9/2022
 */
public class UserProfileMain {

    public static void Main(String[] args) {

        String userName = "Yuting";

        // creates a new userProfile with the name yuting
        UserProfile myProfile = new UserProfile(userName);
        System.out.println("Added user with name" + userName);

        UserProfile myProfile2 = new UserProfile("friendName");

        // user1 (Yuting) adds user2 (friendName) as friend
        myProfile.addFriend(myProfile2);

        // searches for a friend
        myProfile.getFriend("friendName");

        // user1 changes its agent to KAYO
        myProfile.changeAgent(AgentMain.KAYO());

        // fail to add skin because user dosent have enough valPoints

        // addes 1000 valpoints to user
        myProfile.getInventory().setValPoint(1000);

    }

}

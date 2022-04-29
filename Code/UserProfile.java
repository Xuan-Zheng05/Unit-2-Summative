
/**
 * This is the player profile class, contains information about the player
 * @author Yuting Hou
 * 4/28/2022
 */

import java.util.ArrayList;

public class UserProfile {

    /** The name of the player */
    private String username;

    private Agents agent;

    /** PlayerProfiles which is friends with this player */
    ArrayList<UserProfile> friends; // This is an arraylist which just mean that the array is resizable

    /**
     * Constructor with username
     * 
     * @param username the name of the user
     */
    public UserProfile(String username, Agents agent) {
        if (username.length() < 3) {
            System.out.println("Name cannot be smaller than 3 characters.");
        } else if (username.length() > 16) {
            System.out.println("Name cannot be bigger than 16 characters.");
        } else {
            this.username = username;
        }
        this.agent = agent;
    }

    // methods

    /**
     * This method searches for a friend
     * 
     * @param friendName the name of the friend to be searched
     * @return friend the profile of the friend
     */
    public UserProfile getFriend(String friendName) {
        String curr;
        for (int i = 0; i < friends.size(); i++) {
            curr = this.friends.get(i).getUsername();
            if (curr.equals(friendName)) {
                return this.friends.get(i);
            }
        }
        System.out.println("No player found");
        return null;
    }

    public void addFriend(String friendName) {

    }

    // getters

    /**
     * This method returns the user name of the player
     * 
     * @return username the name of the player
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * This method return the user's friendlist
     * 
     * @return friends the user's list of friends
     */
    public ArrayList<UserProfile> getFriends() {
        return this.friends;
    }

    // setters

    /**
     * This method sets the username for the user
     * Username cannot be smaller than 3 or bigger than 6 characters
     * 
     * @param username the username to be changed into
     */
    public void setUsername(String username) {
        if (username.length() < 3) {
            System.out.println("Name cannot be smaller than 3 characters.");
        } else if (username.length() > 16) {
            System.out.println("Name cannot be bigger than 16 characters.");
        } else {
            this.username = username;
        }
    }

    public String toString() {

        String profileString = "";

        profileString = profileString + "Profile: " + this.username + "\n";
        profileString = profileString + agent.toString();

        return profileString;

    }

}

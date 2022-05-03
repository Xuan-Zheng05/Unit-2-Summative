/**
 * This is the user setting class
 * Contains information about the user's game setting
 * 
 * @author Yuting Hou
 *         5/2/2022
 */

public class UserSetting {

    /** The user's vertical resolution */
    private int resolution;

    /** The user's audio volume from 0 to 100 */
    private int volume;

    /** The graphic quality of the game from Low (0) to Ultra (3) */
    private int quality;

    /** The aspect ratio of the game screen */
    private double aspectRatio;

    /** Is the game fullscreen or not */
    private boolean isFullScreen;

    // constructors

    /**
     * Default constructor
     */
    public UserSetting() {
        this.resolution = 1080;
        this.aspectRatio = 16 / 9;
        this.volume = 100;
        this.isFullScreen = true;
    }

    /**
     * Constructor
     * 
     * @param resolution
     * @param aspectRatio
     * @param volume
     * @param isFullScreen
     */
    public UserSetting(int resolution, double aspectRatio, int volume, boolean isFullScreen) {

        if (resolution >= 720 || resolution <= 2160) {
            this.resolution = resolution;
        } else {
            this.resolution = 720;
        }

        if (aspectRatio >= 4 / 3 || aspectRatio <= 21 / 9) {
            this.resolution = resolution;
        } else {
            this.aspectRatio = 16 / 9;
        }

        if (volume <= 0 || volume >= 100) {
            this.volume = volume;
        } else {
            this.volume = 100;
        }

        this.isFullScreen = isFullScreen;

    }

    // getters

    public int getResolution() {
        return this.resolution;
    }

    public int getVolume() {
        return this.volume;
    }

    public int getQuality(){
        return this.quality;
    }

    public double getAspectRato() {
        return this.aspectRatio;
    }

    public boolean getIsFullScreen(){
        return this.isFullScreen;
    }
    
}

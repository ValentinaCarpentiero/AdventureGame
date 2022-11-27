import java.util.HashMap;
import java.util.Map;


/**
 * This class provides the locations and the related way out through which is possible to travel in this adventure game.
 * @author Valentina Carpentiero according to the guidelines of Tim Buchalka.
 */
public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>();
        this.exits.put("Q", 0);
    }


    /**
     * This method provides the way out from a specific location.
     *
     * @param direction the cardinal points to choose the exit.
     * @param location  the location from which is possible to exit.
     */
    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }

    /**
     * Getters for all the fields.
     */

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return exits;
    }

}

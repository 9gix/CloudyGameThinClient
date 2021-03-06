import java.util.List;

public class Game {
    
    private String id;
    private String name;
    private String publisher;
    private Integer maxLimit;
    private String address;

    /** 
     * Constructor for a Game object.
     * 
     * @param gId         the id of the game
     * @param gName       the name of the game
     * @param gPublisher  the publisher of the game
     * @param gLimit      the maximum number of players
     * @param gAddress    the address of the game
     * @param gUsers      the users with access to the game
     *                    given format: "user1","user2","user3",...
     */
    public Game(String gId, String gName, String gPublisher, Integer gLimit, String gAddress) {
        id = gId;
        name = gName;
        publisher = gPublisher;
        maxLimit = gLimit;
        address = gAddress;
    }
    
    /**
     * Get method for the game id
     * 
     * @return  the id of the game
     */
    public String getId() {
        return id;
    }
    
    /**
     * Get method for the game name
     * 
     * @return  the name of the game
     */
    public String getName() {
        return name;
    }
    
    /**
     * Get method for the game publisher
     * 
     * @return  the publisher of the game
     */
    public String getPublisher() {
        return publisher;
    }
    
    /**
     * Get method for the number of players
     * 
     * @return  the maximum number of players
     */
    public Integer getLimit() {
        return maxLimit;
    }
    
    /**
     * Get method for the game address
     * 
     * @return  the address of the game
     */
    public String getAddress() {
        return address;
    }
}

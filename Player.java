/**
 * Player
 */
public class Player {

    // Attributes of each player
    public String position;
    public char positionChar;
    public int playerID; 
    public int playerSkill;

    // Method used to create players
    Player(String position, char positionChar, int playerID, int playerSkill) {
        this.position = position; 
        this.positionChar = positionChar;
        this.playerID = playerID;
        this.playerSkill = playerSkill;
    } 

    // Prints player statistics, to be called from first menu item
    public String playerStats() {
        String playerStat = "Name: " + positionChar + playerID +
        "\nPosition: " + position + "\nSkill Level: " + playerSkill;
        return playerStat;
    }

}
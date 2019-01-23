/**
 * Contains player objects
 * Returns three ints: Forward skill level, defense skill level, and goalie skill level.
 */

import java.util.Random;

public class Team {

    // Creates a random object
    Random rand = new Random(System.currentTimeMillis());

    // Attributes of a team
    public String teamName;
    public int baseForward;
    public int forwardInt;
    public int baseDefense;
    public int defenseInt;
    public int baseGoalie;
    public int goalieInt;

    public Player[] forwards;
    public Player[] defensemen;
    public Player[] goalies;


    // Takes a team name when method is called
    Team(String teamName,
        int baseForward,
        int forwardInt,
        int baseDefense,
        int defenseInt,
        int baseGoalie,
        int goalieInt) {
        this.teamName = teamName; 
        this.baseForward = baseForward;
        this.forwardInt = forwardInt;
        this.baseDefense = baseDefense;
        this.defenseInt = defenseInt;
        this.baseGoalie = baseGoalie;
        this.goalieInt = goalieInt;

        this.forwards = createForwards();
        this.defensemen = createDefensemen();
        this.goalies = createGoalies();       
    }

    // Create all the player objects within a team
    // Makes 13 Forwards
    public Player[] createForwards() {
        Player[] forwards = new Player[1];
        // Try implementing a for loop later
        forwards[0] = new Player("Forward", 'F', rand.nextInt(100) + 1, rand.nextInt(forwardInt) + baseForward);
        return forwards;
    }
        
    // Makes 8 Defensemen
    public Player[] createDefensemen() {
        Player[] defensemen = new Player[1];
        // Try implementing a for loop later
        defensemen[0] = new Player("Defenseman", 'D', rand.nextInt(100) + 1, rand.nextInt(defenseInt) + baseDefense);
        return defensemen;
    }
  

    // Makes 4 Goalies
    public Player[] createGoalies() {
        Player[] goalies = new Player[1];
        // Try implementing a for loop later
        goalies[0] = new Player("Goalie", 'G', rand.nextInt(100) + 1, rand.nextInt(goalieInt) + baseGoalie);
        return goalies;
    }

    // Puts skill level of players in an array
    public int[] forwardSkillArray = {
        forwards[0].playerSkill, 
        // F2.playerSkill,
        // F3.playerSkill,
        // F4.playerSkill,
        // F5.playerSkill,
        // F6.playerSkill,
        // F7.playerSkill,
        // F8.playerSkill,
        // F9.playerSkill,
        // F10.playerSkill,
        // F11.playerSkill,
        // F12.playerSkill,
        // F13.playerSkill
    };

    public int[] defenseSkillArray = {
        defensemen[0].playerSkill,
        // D2.playerSkill,
        // D3.playerSkill,
        // D4.playerSkill,
        // D5.playerSkill,
        // D6.playerSkill,
        // D7.playerSkill,
        // D8.playerSkill,
    };

    public int[] goalieSkillArray = {
        goalies[0].playerSkill,
        // G2.playerSkill,
        // G3.playerSkill,
        // G4.playerSkill
    };

    public int forwardSkill() {
        int sumForward = 0;
        for (int i : forwardSkillArray)
            sumForward += i;
        System.out.println(sumForward);
        return sumForward;
    }

    public int defenseSkill() {
        int sumDefense = 0;
        for (int i : defenseSkillArray)
            sumDefense += i;
        return sumDefense;
    }

    public int goalieSkill() {
        int randGoalie = rand.nextInt(4);
        int sumGoalie = goalieSkillArray[randGoalie];
        return sumGoalie;
    }

    // prints the skill level for this team
    public void printSkill() {
        System.out.println(forwardSkill());
        System.out.println(defenseSkill());
        System.out.println(goalieSkill());
    }
    
}
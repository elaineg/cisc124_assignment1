/**
 * Input: Two team skill integers, dictated by NHL Simulator class
 * Skill Modificatiion: Randomly decides if team will play well and alters team skill
 * Uses team skill to randomly determine game score
 * Output: Returns the game score in an int
 */

import java.util.Random;

public class Game {


    // Method that modifies forward skill level
    public int changeForwardSkill(int forwardSkill) {
        Random rand = new Random(System.currentTimeMillis());
        int fate = rand.nextInt(2);
        if (fate == 1) {
            // Team's forwards play well
            return forwardSkill + 25;
        }
        else {
            // Team's forwards do not play well
            return forwardSkill - 25;
        }
    }


    // Method that modifies defense skill level
    public int changeDefenseSkill(int defenseSkill) {
        Random rand = new Random(System.currentTimeMillis());
        int fate = rand.nextInt(2);
        if (fate == 1) {
            // Team's forwards play well
            return defenseSkill + 40;
        }
        else {
            // Team's forwards do not play well
            return defenseSkill - 40;
        }
    }

    public int changeGoalieSkill(int goalieSkill) {
        Random rand = new Random(System.currentTimeMillis());
        int fate = rand.nextInt(2);
        if (fate == 1) {
            // Team's forwards play well
            return goalieSkill + 60;
        }
        else {
            // Team's forwards do not play well
            return goalieSkill - 60;
        }
    }

    public int regulationScore(int teamSkill) {
        Random randGenerator = new Random(System.currentTimeMillis());

        int scoreGenerator = teamSkill/50;
        int score = randGenerator.nextInt(scoreGenerator+1);
        return score;
    }

    //Name regular time scores R1 and R2
    
    //public void finalScore() {
        //Random randPlayer = new Random();
        //if (R1 == R2) {
            

    }


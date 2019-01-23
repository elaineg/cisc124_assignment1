/**
 * NHLSimulator
 */

//import java.util.Scanner;

public class NHLSimulator {

	

    public static void main(String[] args) {
		NHLSimulator simulation = new NHLSimulator();
		
		Team[] NHLTeams;

		NHLTeams = simulation.createTeams();
		NHLTeams[0].printSkill();
	
		//Scanner menuSelect = new Scanner(System.in);
		//int menuItem = 0;

		

    //     while (menuItem != 9) {
	// 		System.out.println("\n***NHL Simulator Options: Enter numbers using keyboard ***");

	// 		// Builds teams, then teams play each other
	// 		System.out.println("1 - Simulate NHL Season for Eastern Conference");


	// 		// Prompts user for team name input, then displays a spec sheet for given team
	// 		System.out.println("2 - View Team Skill Level Profile");

	// 		// Shows end of season standings table
	// 		System.out.println("3 - Display End of Regular Season Table");
			
	// 		System.out.println("9 - Exit");
	// 		System.out.println();
    //         System.out.println("Select options [1, 2, 3] or 9 to Quit");
            
    //         menuItem = menuSelect.nextInt();

    //         if (menuItem == 1) {
	// 			System.out.println("\n*** Running console input demo ***\n");
				
	// 			// Code that builds team array
	// 			// Each team in array plays 15 other teams
	// 			// Final score is returned
	// 			// Print: Simulation complete and return to main menu

				
				
				
	// 		}
	// 		else if (menuItem == 2) {
	// 			System.out.println("\n*** Running array demo ***\n");
				
	// 			// Point to method that checks if step 1 has been complete
	// 			// Send to method that prompts user to enter team name 
	// 			// Check for team name within team name array (Or maybe use a selection menu)
	// 			// Call printTeam method for chosen team
				
	// 		}
	// 		else if (menuItem == 3) {
	// 			System.out.println("\n*** Running random numbers in range demo ***\n");
				
	// 			// Point to method that displays the returned scoresheet
				
	// 		}
    //     }
	}
	
	public Team[] createTeams() {
		Team[] teamArray = new Team[2];
		teamArray[0] = new Team("Boston", 5, 5, 4, 6, 5, 3);
		teamArray[1] = new Team("Buffalo", 6, 4, 4, 4, 4, 4);
		return teamArray;
	}

}


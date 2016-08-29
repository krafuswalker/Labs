import java.util.Scanner;


public class DiceRoll5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Welcome players to the game
		System.out.println("Welcome To The Grand Circus Casino!");
		Scanner sc = new Scanner(System.in);          //Create a scanner to get users answers
		String yesOrNo = "y";                             	//Declare a string variable to handle user yes no answers
				do												// Start a do loop to process inputs and print roll results
		{
		System.out.println("How many sides should each die have?");	
		int sidesNum = sc.nextInt();                       // Declare and assign value to the number to process up to
		System.out.println("Number of sides is " + sidesNum);
		System.out.println("OK.  Enter 1 to Roll The Dice");				// Ask for and get while condition
		int roll = sc.nextInt();                                                // Allow user to toggle dice roll
		//call the Method to roll the die
		System.out.println("Die 1    " + rollADie(sidesNum)); 				 // Get random value of die 1
		System.out.println("Die 2    " + rollADie(sidesNum - 4));                // Get random value of die 2

				
		// Consider Random number generator using math
		// Math.random()
		//  Consider Random number generator using Scanner 
		
		
		
	} while (yesOrNo.equals("y"));                                          // set and check for while condition
		System.out.println("Good-Bye.  Thanks for playing");
	}
	public static int rollADie(int sidesNum){
	// Ask for or Generate number of sides
		return sidesNum ;
	  

	}
}

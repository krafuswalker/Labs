import java.util.Random;											//import random generator
import java.util.Scanner;											//import scanner


public class DiceRoll6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Welcome players to the game
		System.out.println("Welcome To The Grand Circus Casino!");
		Scanner sc = new Scanner(System.in);                     //Create a scanner to get users answers
		String yesOrNo;                             	         //Declare a string variable to handle user yes no answers
		int myNew;                                               // Declare integer to handle new random numbers
		int roll;												 // Allows users to roll the dice
				do									 			 // Start a do loop to process inputs and print roll results
		{
		System.out.println("How many sides should each die have?");	
		int sidesNum = sc.nextInt();		                     // Declare and assign value to the number to process up to
		
		System.out.println("Number of sides is " + sidesNum);               // Show what the user selected
		System.out.println(" ");               								// Print blank line
		System.out.println("OK.  Enter 1 to Roll The Dice");				// Ask for and get while condition
		roll = sc.nextInt();                                                // Allow user to toggle dice roll
		// Call the Method to roll the die
		// Create a random number up to number user  chose
		Random ran = new Random();{
			myNew =ran.nextInt(sidesNum);									//Generate a random number from 0 to sides chosen
			 		
			}
		if  								                                   //ADD 1 if random number is zero
			(myNew == 0);
			{myNew = myNew + 1;
		    } 
		
		System.out.println("Die 1    " + myNew); 				                // Get random value of die 1
		//Create a random number for die 2 up to sidesNum
		
		myNew =ran.nextInt(sidesNum);
		
		if 
		 								                                   //ADD 1 if random number is zero
		   (myNew == 0);
		   {myNew = myNew + 1;
		   }
		System.out.println("Die 2    " +  myNew);                             // Get random value of die 2

		System.out.println(" ");               								  // Print blank line
		System.out.println("Do You Want to Roll Again?");					  // Ask for and get while condition
		 yesOrNo = sc.next();
		
		
	   } while (yesOrNo.equals("y"));                                          // set and check for while condition
		System.out.println("Good-Bye.  Thanks for playing");
	
	
	
	 
		}
	{
}
}
	 


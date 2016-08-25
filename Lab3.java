
import java.util.Scanner;   // Import Scanner utility
public class Lab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Learn your squares and cubes!");
		Scanner sc = new Scanner(System.in);                  //Create a scanner named sc
		String yesOrNo;										  //Declare a string variable to handle user yes no answers
		do													  // Start a do loop to process and print table 
		{
			
			System.out.println("Enter an integer:");          // Ask user for a number to process up to starting at 1
			int lastnum = sc.nextInt();                       // Declare and assign value to the number to process up to
			System.out.println("Number" + "\t\t\t" + "Squared" + "\t\t\t" + "Cubed");       // Print column headings
			System.out.println("======" +  "\t\t\t" + "=======" + "\t\t\t" + "======");     // Print column decor
			
			for (int i=1;i <= lastnum; i++)										//start for  funtion to increment integer by 1 
			{
				int sq = i * i; 												//declare and calculate Square root numbers
				int cb = i * i * i;                                             //declare and calculate cubed numbers
				System.out.println(i + "\t\t\t" + sq + "\t\t\t" + cb);          //  print calclated results
			}
			System.out.println("Do you want to continue?");						// Ask for and get while condition
			 yesOrNo = sc.next();
			
			
		} while (yesOrNo.equals("y"));                                          // set and check for while condition
	
	System.out.println("Good-bye. Good-Thank you for using our code");		
	
	}

}

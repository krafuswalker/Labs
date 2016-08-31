import java.util.InputMismatchException;
import java.util.Scanner; // Import Scanner utility

public class Lab7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // Start Main Method
		// TODO Auto-generated method stub
		// Define variables and initialize strings
		String[] firstname = { "Brent", "John", "Sam", "Tom", "Sally", "Sue",
				"Hank", "Mary", "Helen", "Cliff", "Will", "Kim" };
		String[] lastname = { "Price", "Jones", "Sill", "Mac", "Fox", "Reyes",
				"Cook", "Mills", "Orr", "Rose", "Dukes", "He" };
		String[] food = { "Soup", "Rice", "Beans", "Stew", "Ice", "Rice",
				"Stew", "Oats", "BBQ", "Kale", "Beans", "Soup" };
		String[] birthplace = { "NY", "PA", "Boston", "FLA", "Minn.", "Tampa",
				"LA", "Dalas", "Pitts.", "NO", "DAL", "Oregan" };
		// created needed variables
		int index = 0;
		String response = "y";
		String choice = "y";
		String keepGoing = "y";
		Scanner sc = new Scanner(System.in);
		int i = 0;
		// list all students
		while (response.equalsIgnoreCase("y")) { // Start outer for entire
													// system
			for (i = 0; i < 12; i++) {
				System.out.println((i + 1) + " " + firstname[i]);
			}

			// Get student index request
			System.out.println("Please Select A Student Index From 1 to 12: ");
			try { // Look for out of range index input. Only process valid input
				index = sc.nextInt();
				System.out.println("You entered number " + index);
				System.out.println("You are looking for information on "
						+ firstname[index - 1] + " " + lastname[index - 1]);
				while (response.equalsIgnoreCase("y")) { // Start inner while
					System.out.println("What would you like to know about "
							+ firstname[index - 1]
							+ "?( Enter Food or Hometown)");
					String englishWord = sc.nextLine();
					choice = sc.nextLine(); // Place use input into a variable
					if // See if the choice was for favorite food
					(choice.equalsIgnoreCase("Food")) {
						System.out.println(firstname[index - 1]
								+ "'s favorite food is " + food[index - 1]);
						break;
					} // close if
					else if (choice.equalsIgnoreCase("Hometown")) {
						System.out.println(firstname[index - 1]
								+ "'s hometown is " + birthplace[index - 1]);
						break;
					} // Close else if
					else {
						System.out.println("Could Not Process Your Request");
						// Loop to get a valid response
						System.out.println("Do you want to try again? (enter y or n)");
						response = sc.next();
						if (response.equals("n")) {
							System.out.println("OK");
							break;
						} // close If do not want to continue
					}// Close else portion
				} // Close Inner While
			} // Close TRY

			catch (IndexOutOfBoundsException ex) { // Start Catch
				System.out.println("You did not enter a valid Number  ");
			} // Close catch
			System.out.println("Would You Like To Continue Using The System?(enter y or n)");
			response = sc.next();
			if (keepGoing.equals("n")) {
				System.out.println("Good-bye");
			} // End if continue to use system
		} // End while Continue using System
	} // End Main Method
} // End Program

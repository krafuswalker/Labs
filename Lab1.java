import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab1 {

	/**
	 * @author Krafus Walker
	 * @Program to calculate Perimeter and Area of various classrooms at Grand
	 *          Circus based on user input.
	 */
	// Update to add contiue and did formatting

	public static void main(String[] args) {
		// Prompt user to enter values

		Scanner scanner = new Scanner(System.in);
		String choice = "y";
		DecimalFormat decFor = new DecimalFormat("0.##");

		while (choice.equalsIgnoreCase("y")) {
			System.out.println(" ");
			System.out.println("Please Enter The Classroom Length:");

			double length = scanner.nextDouble();

			System.out.println("Please Enter The Classroom Width:");
			double width = scanner.nextDouble();
			double area = width * length;
			double perimeter = 2 * width + 2 * length;
			// print out results for area and perimeter
			System.out.print("The Classroom Area Is: ");
			System.out.println(decFor.format(area));
			System.out.print("The Classroom Perimeter Is: ");
			System.out.println(decFor.format(perimeter));
			System.out.println();
			System.out.println("Now Let's Calculate The Volume.");
			System.out.println("Please Enter The Classroom Height:");
			double height = scanner.nextDouble();

			System.out.print("The Volume Of Classroom Is:  ");
			double Volume = height * width * length;
			System.out.println(decFor.format(Volume));
			System.out.println(" ");

			// see if customer wants to continue
			System.out.print("Continue? (y/n): ");
			System.out.print(" ");
			choice = scanner.next();
		}
		scanner.close();
		System.out.println("Good-bye");
	}

}
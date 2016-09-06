import java.util.Scanner;

public class CircleApp {

	/**
	 * @param args
	 */

	// define variables

	// create an instance of the Scanner Method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radius;
		double circumference = 0;
		double area = 0;
		double count;
		String toContinue = "y";
		do {
			System.out.println("Enter Radius: ");
			radius = sc.nextDouble();
			// Call Methods in Circle Class to Calculate Circumference and Area
			Circle myCircle = new Circle(radius);
			System.out.println("Radius Is: " + radius);
			System.out.println("Circumference Is: " + myCircle.getFormattedCircumference());
			//System.out.println("Formatted:  " + Double.toString(myCircle.getCircumference()));
			System.out.println("Area Is: ");
			System.out.println("Would You Like to Continue? (enter y or n):  ");
			toContinue = sc.next();
		} while (toContinue.equals("y"));
		{
		}

		System.out.println("Good Bye");
		System.out.println("You Created " + "Cirlce Objects");

	}

}

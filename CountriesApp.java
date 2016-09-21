

import java.util.ArrayList;
import java.util.Scanner;

import co.grandcircus.studentlist.CountriesTextFile;

public class CountriesApp  {

	/**
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listOfCountries = new ArrayList<String>();
		//Load the Array listOfCountries with saved info
		
		Scanner sc = new Scanner(System.in);
		String country = null;
		System.out.println("Maintain A List Of Countries ");
		int option = 0;

		while (option != 3) {
			System.out.println("Enter An Option: 1, 2, or 3");
			System.out.println("1: Display A List Of Countries");
			System.out.println("2: Add A Country To The Data Base");
			System.out.println("3: Exit This Program");
			// System.out.println("Good-bye!");
			option = sc.nextInt(); // for (String countries : countryList) {
			if (option == 1) {
			  for (String countries : listOfCountries) {
					System.out.println(countries);
				}
			} else if (option == 2) {
				System.out.println("Enter A Country To Add");
				country = sc.next();
				listOfCountries.add(country);
			}
		}
		// Write to file.  Create an instance variable of 
		CountriesTextFile myCountriesTextFile = new CountriesTextFile();
		
		myCountriesTextFile.saveCountries(listOfCountries);
		System.out.println("Good Bye");
		sc.close();

	}
}

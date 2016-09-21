package co.grandcircus.studentlist;
/**
	 * Responsible for reading and writing list of countries to a file.
	 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountriesTextFile {
	
	
	/**
		 * The path of the file where countries are stored.
		 */
	private Path filePath;
		
	/**
		 * Constructor that lets you choose a file path.
		 * 
		 * @param filePathString path of the file where countries are stored.
	*/
	
	public CountriesTextFile(String filePathString) {
		this.filePath = Paths.get(filePathString);
	}
		
	/**
	 * Constructor that uses the default file path to store countries.
	 */
	 
	public CountriesTextFile() {
		this("src/co/grandcircus/studentlist/CountriesTextFile/countries.txt");	
	}	
		/**
		 * Read the file and returns all the countries listed in the file.
		 * 
		 * @return A List of countries. If not file exists, it returns an empty list.
		 * @throws RuntimeException if something goes wrong while accessing the file.
		 */
		public List<String> readCountries() {
			List<String> countries = new ArrayList<>();
			if (!Files.exists(filePath)) {
				return countries;
			}
			
			try {
				File file = filePath.toFile();
				FileReader fileReader = new FileReader(file);
				BufferedReader reader = new BufferedReader(fileReader);
			 
				String country = reader.readLine();
				while (country != null) {
					countries.add(country); //add a country
					country = reader.readLine();
				}
				
				reader.close();
				return countries;
			} catch (IOException ex) {
				throw new RuntimeException("Unable to read countries.", ex);
			}
		}
		
		/**
		 * Writes a list of countries to the file.
		 * 
		 * @param countries The list of countries to write.
		 * @throws RuntimeException if something goes wrong while accessing the file
		 */
		public void saveCountries(List<String> countries) {
			try {
				if (!Files.exists(filePath)) {
					Files.createFile(filePath);
				}
				
				File file = filePath.toFile();
				PrintWriter writer = new PrintWriter(file);
				
				for (String country : countries) {
					writer.println(country);
				}
				
				writer.close();
			} catch (IOException ex) { // IOException is a checked exception (I have to handle it)
				// RuntimeException is an unchecked exception (I don't have to handle it)
				throw new RuntimeException("Unable to save Countries.", ex);
			}
		}

}



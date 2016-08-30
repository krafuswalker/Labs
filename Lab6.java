import java.util.Scanner;

public class Lab6 {
	

	public static void main(String[] args) {
		// TODO Write this code. You will have a loop and call translateWord
		// from here.
		String firstCharacter = "B";                               //Declare and set the first character of a word
		String yesOrNo;
		String latinWord = "";
		String englishWord;
		String lowerCase;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		   //Allow user to input a word as long as he/she chooses
		do {
		System.out.println("Please Enter A Word To Translate: ");
		englishWord = sc.nextLine();
		System.out.println(englishWord);
		 // Call for English to Latin translate method
		 latinWord = translateWord(englishWord);
		System.out.println("Latin Word Is: ");
	    System.out.println(latinWord);
	    System.out.println("Would you Like To Continue");
	    yesOrNo = sc.nextLine();
	    while {
	    	(yesOrNo.equals("y"));
	          }
		
	}
	 

	/**
	 * This method takes any single English word and translates it to a Pig
	 * Latin word.
	 */
	public static String translateWord(String englishWord) {
	// change case of word to all lower csse
		String str1 = " ";
		String str2 = " ";
        String str3 = " ";
        String latinWord = "";
	String lowerCase = englishWord.toLowerCase();
	//Check for vowel in first letter location
	char firstLetter = lowerCase.charAt(0);
	//Check for vowel in first letter location
	for (int i = 0; i < englishWord.length(); i++){
      if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u');
          { String latinWord = lowerCase.concat("way");
          return latinWord;
          }    
      else 
          {
		  System.out.println("Your Word Starts With A Consonant");
          }
	      
      // PROCESS English Word That Starts with a Consonant
         
      //Find where the First Vowel in the word is
     for (int i = 0; i < englishWord.length(); i++){
       if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u');  
      // Create an index to mark where the first vowel starts
       int index = (i);
      }
       else 
         {
    	 String str2 = str2 + lowerCase.charAt(i);
         }
      // Create a string that starts at the vowel and goes to the end of the original english word
      String str1 = lowerCase.substring(index);
      String str3 = str1 + str2;
      String latiinWord = str3.concat("ay");
      return latinWord;
      
      
	}
   // publi.c char charAT(int 0){
//return returnCharacter;


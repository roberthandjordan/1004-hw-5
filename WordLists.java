//****************************************************************************
//Robert Jordan
//rhj2002@columbia.edu
//This file contains the Words Lists Class of the program for the Scrabble 
//Dictionary Checker assignment.
//
//Java Version 6
//****************************************************************************

public class WordLists {
	private String fileChoice;
	private String[] currentList;
	private ArrayList<String> dictList;	// this should be entire dictionary read in from file
	//instance variables

	public WordLists() {
		fileChoice = "dictionary.txt";

		File inFile = new File(fileChoice);
		Scanner dataIn = new Scanner(inFile);
		String fileEntry;
		PrintWriter dataOut = new PrintWriter("outfile.txt");
		while (dataIn.hasNext()) {
			fileEntry = dataIn.next();
			dataOut.println(fileEntry);
		}
		dataOut.close();

		//
	}
	//default constructor	

	public WordLists(String fileName) {
		fileChoice = fileName;

		File inFile = new File(fileChoice);
		Scanner dataIn = new Scanner(inFile);
		String fileEntry;
		while (dataIn.hasNext()) {
			fileEntry = dataIn.next();
			dictList.append(fileEntry);
		}
		//System.out.println(dictList);
		
	}
	//constructor with parameters

	public printLists(String[] results) {

	}
	//

	public writeLists(String[] results) {
		//toString method?
		PrintWriter dataOut = new PrintWriter("outfile.txt");

		// for loop over results
			// save the current string as fileEntry
			// dataOut.println(fileEntry);
		//dataOut.close();

	}
	//

	public void launch(String[] fileName) {
		//
	}

	public void target(int g, int h, char letter) {
		//
	}
	//

	public String[] lengthN(int n) {
		//
		// initialize array String[] results = new String[5000] or size of dictList, could be stored as an instance variable
		// loop over dictList, and check size of each word
			// append words of correct length to an ArrayList<String> results
		// get the size of ArrayList, and then create String[] of this size, and copy everything over, return this String[]
		

	}
	//

	public String[] startsWith(int n, char firstLetter) {
		//local variable?
		//firstLetter
	}
	//

	public String[] containsLetter(int n, char included) {

	}
	//

	public String[] vowelHeavy(int n, int m) {
		//toString method?
	}
	//

	public String[] multiLetter(int m, char included) {

	}
	//

	public void someMethod() {
		//what?
	}
	//

	/*
	try {
		//
	}
	catch (IOException e) {
		//
	}
	catch (ArrayIndexOutOfBoundsException e) {
		//
	}
	*/
	
}

//****************************************************************************
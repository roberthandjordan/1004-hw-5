//****************************************************************************
//Robert Jordan
//rhj2002@columbia.edu
//This file contains the Words Lists Class of the program for the Scrabble 
//Dictionary Checker assignment.
//
//Java Version 6
//****************************************************************************

public class WordLists {
	String fileChoice;
	//instance variables

	public WordLists() {
		fileChoice = "dictionary.txt";

		File inFile = new File(args[0]);
		Scanner dataIn = new Scanner(inFile);
		String fileEntry;
		PrintWriter dataOut = new PrintWriter(args[1]);
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

		File inFile = new File(args[0]);
		Scanner dataIn = new Scanner(inFile);
		String fileEntry;
		PrintWriter dataOut = new PrintWriter(args[1]);
		while (dataIn.hasNext()) {
			fileEntry = dataIn.next();
			dataOut.println(fileEntry);
		}
			dataOut.close();

		//
	}
	//constructor with parameters

	public printLists(String[] results) {

	}
	//

	public writeLists(String[] results) {
		//toString method?
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
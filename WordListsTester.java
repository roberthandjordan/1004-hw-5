//****************************************************************************
//Robert Jordan
//rhj2002@columbia.edu
//This file contains the Words List Tester Class and is the tester of the 
//program for the Scrabble Dictionary Checker assignment.
//
//Java Version 6
//****************************************************************************


public class WordListsTester {

	public static void main(String[] args) {
		int again = 0;
		//again initialized as zero for use in do while loop so that it will 
		//execute once, but will exit unless otherwise prompted

		System.out.println("Welcome to the Scabble Dictionary Checker!!!!!"
			+ \n "This program will offer you a set of options for generating "
			+ "words.  You can choose between a number of functions, "
			+ "the results of which will be written out to a file.");


		do {
			if (args.length>0) {
				WordLists portal = new WordLists();
				portal.launch();


			}
			else {
				WordLists portal = new WordLists(args);
				portal.launch(args);


			}


			System.out.println("Would you like to try again?"
				+ \n "Please enter 1 for yes or 0 for no.");

			//try-catch construct to detect user choice to repeat or not
			try {
			Scanner trial = new Scanner(System.in);
			again = trial.nextInt();
			}
			catch (IOException e) {
				//
				System.out.println("Please enter only either 1 for yes or "
					+ "0 for no.");
				Scanner retrial = new Scanner(System.in);
				again = retrial.nextInt();
			}
			catch (ArrayIndexOutOfBoundsException e) {
				//
			}
			
			//condition of do-while loop
		} while (again == 1);

	}

}

//****************************************************************************
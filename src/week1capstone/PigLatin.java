package week1capstone;

import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Pig Latin Translator!");

		String cont;
		String str = "way"; // make it str, cant make it anything else because string wont be resolved to
							// variable
		String str2 = "ay";// same with string 2, just make it str2

		do {// Using a do while loop
			System.out.print("\nEnter a line to be translated: ");
			String translate = input.nextLine();

			translate = translate.toLowerCase();
			System.out.println(translate);
			translate.split(" "); // The Split Method splits up a sentence by each space in between
			String[] arrayWords = translate.split(" ");

			int vowelPosition = translate.length();

			for (int x = 0; x < arrayWords.length; x++) {
				translate = arrayWords[x];
				// checking first letter in word if its a vowel the add "way"
				if (translate.startsWith("A") || translate.startsWith("E") || translate.startsWith("I")
						|| translate.startsWith("O") || translate.startsWith("U") || translate.startsWith("a")
						|| translate.startsWith("e") || translate.startsWith("i") || translate.startsWith("o")
						|| translate.startsWith("u")) {

					translate = translate + str;
				} else {
					for (int i = 0; i < vowelPosition; i++) {
						// Adding ay by counting each letter
						if (!(translate.startsWith("a")) && !(translate.startsWith("e")) && !(translate.startsWith("i"))
								&& !(translate.startsWith("o")) && !(translate.startsWith("u"))) {

							char firstLetter = translate.charAt(0); // get first letter

							translate = translate.substring(1);
							translate = translate + firstLetter;

						} else {
							// add first letter and "ay" to end of user input string
							translate = translate + "ay";

							break;

						}
					}
				} // Print line after else statement with the input (translate) and just
					// whitespace after
				System.out.print(translate + " ");

			} // ending the program or restarting
			System.out.println("\nTranslate another line? (y/n): ");
			cont = input.nextLine();
		} while (cont.equals("y")); // while loop has to be after do loop for looping program
		{

		}
		if (cont.equalsIgnoreCase("n")) {
			System.out.println("✌🏼");
		}
	}
}

/**
 * Code to move one word from the front of a phrase to the end
 * Author: Amine Bourdi
 * Date 9/8/2014
 * 
 * Algorithm
 * 
 * Allow user to input a line of text
 * Tell user to input a line of text without punctuation
 * Take input from user
 * find out where the first word ends
 * create substring for first word
 * find out length of entire string
 * Create substring of entire string besides the first word
 * Tell user the new phrase is about to be displayed
 * display new line of text
 * 
 */



import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
	//Allow user to input a line of text
	Scanner keyboard = new Scanner(System.in);
	//Tell user to input a line of text without punctuation
	System.out.println("Enter a line of text. No punctuation please.");
	//Take input from user
	String Phrase = keyboard.nextLine();
	keyboard.close();	
	//find out where the first word ends
	int firstspace = Phrase.indexOf(" ");
	//create substring for first word
	String Firstword = Phrase.substring(0, firstspace);
	//find out length of entire string
	int length = Phrase.length();
	//Create substring of entire string besides the first word
	String Restofphrase = Phrase.substring(firstspace + 1, length);
	//Tell user the new phrase is about to be displayed
	System.out.println("The new phrase is:");
	//display new line of text
	System.out.println(Restofphrase + " " + Firstword);
	keyboard.close();	
	}

}
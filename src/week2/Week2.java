package week2;

import java.util.Scanner;

public class Week2 {

	
	private static final String TheOne21 = "TheOne21";

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean passwordFound = false;
	for (int i = 10; i < 15 && !passwordFound; i++) {
	System.out.println("Please enter your password - attempt #" + (i+1 - 10));
	String passWord = sc.nextLine();
	
	if (passWord.equals(TheOne21)) { 
		System.out.println("You may enter");
		break;
		// Redirect to web page!
	} else {
		System.out.println("Please try again");
	
	}
	
	}

}}

package test;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = new String();
		input = s.next();
		s.close();
		StringBuilder reverseInput = new StringBuilder(input);
		reverseInput.reverse();
		boolean result = input.equals(reverseInput.toString()) ; 
		System.out.println( result ? "The input string is a palindrome" : "The input string is not a palindrome" );
	}
}

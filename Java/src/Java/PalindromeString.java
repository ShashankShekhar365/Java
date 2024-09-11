package Java;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();

		// Store the original string
		String org_str = str;
		String rev = "";
		int len = str.length();

		// Iterate from the end of the string to the beginning
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		// Check if the original string and reversed string are the same
		if (org_str.equals(rev)) {
			System.out.println(org_str + " is a Palindrome string");
		} else {
			System.out.println(org_str + " is not a Palindrome string");
		}

		sc.close();
	}
}
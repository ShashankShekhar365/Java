package Java;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {

		String input = "programming";
		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (char ch : input.toCharArray()) {
			set.add(ch);
		}

		StringBuilder result = new StringBuilder();
		for (char ch : set) {
			result.append(ch);
		}

		System.out.println("Original String: " + input);
		System.out.println("After Removing Duplicates: " + result);
	}
}
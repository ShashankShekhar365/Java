package Java;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {

	public static void main(String[] args) {

		String input = "programming";

		// Convert string to lowercase (optional)
		input = input.toLowerCase();

		HashMap<Character, Integer> map = new HashMap<>();

		// Count each character
		for (char ch : input.toCharArray()) {

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		System.out.println("Duplicate characters in string: " + input);

		// Print duplicates
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
			}
		}
	}
}
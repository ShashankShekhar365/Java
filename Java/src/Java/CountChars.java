package Java;

import java.util.HashMap;
import java.util.Map;

public class CountChars {
	public static void main(String[] args) {
		String str = "hello";
		Map<Character, Integer> count = new HashMap<>();

		for (char c : str.toCharArray()) {
			count.put(c, count.getOrDefault(c, 0) + 1);
		}
		System.out.println(count);
	}
}

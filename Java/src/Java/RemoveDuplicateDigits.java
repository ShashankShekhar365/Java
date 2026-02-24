package Java;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateDigits {
	public static void main(String[] args) {
		String number = "6656638292727";
		Set<Character> set = new LinkedHashSet<>();
		for (char ch : number.toCharArray()) {
			set.add(ch);
		}
		for (char ch : set) {
			System.out.println(ch);
		}
	}

}

package Java;

import java.util.Scanner;

public class calculator {

//	do while
	public static void main(String[] args) {
		String yn;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Enter first number:");
			float f = s.nextFloat();
			System.out.println("Enter second number:");
			float f2 = s.nextFloat();
			System.out.println("Enter symbol(+,-,*,/)");
			String symbol = s.next();
			float result;
			switch (symbol) {
			case "+":
				result = f + f2;
				System.out.println("Addition is:" + result);
				break;
			case "-":
				result = f - f2;
				System.out.println("Subtraction is:" + result);
				break;
			case "*":
				result = f * f2;
				System.out.println("Multiplication is:" + result);
				break;
			case "/":
				result = f / f2;
				System.out.println("Division is:" + result);
				break;
			default:
				System.out.println("Invalid symbol");
				break;
			}
			System.out.println("Do you want to continue (Press y for yes and n for no");
			yn = s.next();
		} while (yn.equalsIgnoreCase("y"));
		s.close();
	}
}

//*****************************************************
//only while

// Scanner s = new Scanner(System.in);
//		System.out.println("Enter first number:");
//		float f = s.nextFloat();
//		System.out.println("Enter second number:");
//		float f2 = s.nextFloat();
//		System.out.println("Enter symbol(+,-,*,/)");
//		String symbol = s.next();
//		float result;
//		switch (symbol) {
//		case "+":
//			result = f + f2;
//			System.out.println("Addition is:" + result);
//			break;
//		case "-":
//			result = f - f2;
//			System.out.println("Subtraction is:" + result);
//			break;
//		case "*":
//			result = f * f2;
//			System.out.println("Multiplication is:" + result);
//			break;
//		case "/":
//			result = f / f2;
//			System.out.println("Division is:" + result);
//			break;
//		default:
//			System.out.println("Invalid symbol");
//			break;
//		}

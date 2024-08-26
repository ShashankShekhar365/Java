package Java;

public class Swap2Numbers {

	public static void main(String[] args) {
		// Method 1 : Using a third variable
		int a = 20, b = 30;
//		System.out.println("Number before swapping " + a + " " + b);
//		int t = a;
//		a = b;
//		b = t;
//		System.out.println("Number after swapping " + a + " " + b);
		
		//Method 2 : Wothout any third variable
		System.out.println("Number before swapping " + a + " " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Number after swapping " + a + " " + b);

	}

}

import java.util.Scanner;

public class executionWithConditionalValues {

	public static void main (String [] args) {
		
		Scanner inn = new Scanner (System.in);
		
		int number1;
		int number2;
		
		System.out.print ("Write the first integer number: ");
		number1 = inn.nextInt();
		
		System.out.print ("Write the second integer number: ");
		number2 = inn.nextInt();
		
		if (number1 == number2) {
			System.out.printf("%d == %d%n", number1, number2);
		}
		
		if (number1 != number2) {
			System.out.printf("%d != %d%n", number1, number2);
		}
		
		if (number1 < number2) {
			System.out.printf("%d < %d%n", number1, number2);
		}
		
		if (number1 > number2) {
			System.out.printf("%d > %d%n", number1, number2);
		}
		
		if (number1 <= number2) {
			System.out.printf("%d <= %d%n", number1, number2);
		}
		
		if (number1 >= number2) {
			System.out.printf("%d >= %d%n", number1, number2);
		}
		
	}

}

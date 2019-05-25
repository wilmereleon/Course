import java.util.Scanner;

public class ScannerUse {

	public static void main(String[] args) {
		Scanner inn = new Scanner (System.in);
		
		int number1;
		int number2;
		int plusResult;
		
		System.out.print ("Write the first number: ");
		number1 = inn.nextInt();
		
		System.out.print ("Write the second number: + ");
		number2 = inn.nextInt();
		
		plusResult = number1 + number2;

		System.out.print (" = "+plusResult);
	}

}

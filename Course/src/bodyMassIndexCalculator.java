import java.util.Scanner;

public class bodyMassIndexCalculator {

	public static void main(String[] args) {
		
		Scanner inn = new Scanner (System.in);
		
		double weight;
		double height;
		
		System.out.print ("Write the weight in kilograms: ");
		weight = inn.nextDouble ();
		
		System.out.println ("Its weight is: "+weight+" kg");
		
		System.out.print ("Write the height in metric system: ");
		height = inn.nextDouble ();
		
		System.out.println ("Its height is: "+height+" m");
		
		double heightInch;
		heightInch = height * 39.3701;
		
		double weightAmericanLb;
		double valueChange; 
		valueChange = ((1000 - 907.18474) + (weight * 1000)) / 907.18474;
		weightAmericanLb = valueChange + ((weight * 1000) / 907.18474);
		double weightAmericanKg = (weight * 907.18474) / 1000;
		
		double bmi = ((weightAmericanLb * 703) / (Math.pow(heightInch, 2)));
		System.out.println ("Its weight in American Kilograms is "+weightAmericanKg+" g ("+(weightAmericanKg * 2)+" lb)");
		System.out.println ("Its height in Inch is "+heightInch);
		System.out.println ("Its body mass index is: "+bmi);
		
	}

}

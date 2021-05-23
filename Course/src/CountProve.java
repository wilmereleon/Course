import java.util.Scanner;

public class CountProve {

	public static void main (String [] args) {
		
		Scanner inn = new Scanner (System.in);
		
		Count myCount = new Count();
		//Count count1 = new Count("Jane Green");
		
		System.out.printf ("The initial name is: %s%n%n", myCount.getName());
		
		System.out.println ("Introduce the name: ");
		String theName = inn.nextLine(); // Type String (for letters)
		myCount.setName(theName); //Introduce the name in «myCount»
		System.out.println();
		
		System.out.printf ("The name in the object 'myCount' is: %n%s%n", myCount.getName());

	}

}

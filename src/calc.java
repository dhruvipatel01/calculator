import java.util.Scanner;

public class calc {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter two numbers, They can be floats or doubles.");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		Scanner question1 = new Scanner(System.in);
		System.out.println("Pick pick from the options: \n Add \n Subtract \n Multiply \n Divide");
		String answer1 = question1.nextLine();
		
		if (answer1.equalsIgnoreCase("Add")) {
			System.out.println(num1 + num2);
		} 
		else if  (answer1.equalsIgnoreCase("Subtract"))
		{
			System.out.println(num1 - num2);
		}
		else if (answer1.equalsIgnoreCase("Multiply")) 
		{
			System.out.println(num1 * num2);
	
		}else if (answer1.equalsIgnoreCase("Divide"))
		{
			if (num2 == 0) {
				System.out.println("Error: Divide by Zero");
			}
			else {
				System.out.println(num1 / num2);
			}
		
		} else {
			
			System.out.println("You did not enter one of the options");
			System.exit(0);
			
		}
		
	}

}

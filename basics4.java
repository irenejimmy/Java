package irene;
import java.util.Scanner;
public class basics4 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 System.out.print("Enter the first number: ");
     int num1 = scanner.nextInt();

     System.out.print("Enter the second number: ");
     int num2 = scanner.nextInt();
     int sum = num1 + num2;
     int difference = num1 - num2;
     int product = num1 * num2;
     int quotient = num2 / num1;

   
     System.out.println("Sum: " + sum);
     System.out.println("Difference: " + difference);
     System.out.println("Product: " + product);
     System.out.println("Quotient: " + quotient);

     scanner.close();

	      

	}
}

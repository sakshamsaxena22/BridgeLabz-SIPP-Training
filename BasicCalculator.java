package Day_1;
import java.util.Scanner;
public class BasicCalculator {
	public static void main (String[]args) {
		
		//taking input
		Scanner input =new Scanner(System.in);
	System.out.print("Enter first number: ");
    double num1 = input.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = input.nextDouble();
    System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + 
                      num1 + " and " + num2 + " is " + (num1+num2) + ", " + (num1-num2) + 
                      ", " + (num1*num2) + ", and " + (num1/num2));

}
}

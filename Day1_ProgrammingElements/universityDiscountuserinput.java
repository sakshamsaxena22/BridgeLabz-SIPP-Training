package Day_1;
import java.util.Scanner;

public class universityDiscountuserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter student fee: ");
		Scanner sc =new Scanner(System.in);
        int userFee = sc.nextInt();
        System.out.print("Enter discount percentage: ");
        int userDiscountPercent = sc.nextInt();
        double userDiscount = userFee * userDiscountPercent / 100.0;
        double userDiscountedFee = userFee - userDiscount;
        System.out.println("The discount amount is INR " + userDiscount + 
                          " and final discounted fee is INR " + userDiscountedFee);

	}

}

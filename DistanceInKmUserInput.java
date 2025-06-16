package Day_1;

import java.util.Scanner;

public class DistanceInKmUserInput {
	public static void main(String[]args) {
		Scanner input =new Scanner(System.in);
		double distanceinkm= input.nextInt();
		double distanceinmiles=distanceinkm*1.6;
		System.out.println("Distance in km:" + distanceinkm+ "distance in miles is: "+ distanceinmiles);
	}

}

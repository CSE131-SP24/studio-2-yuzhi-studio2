package studio2;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("How many darts?");
		int numberDarts = scan.nextInt();
		int dartsInCircle = 0;
		
		for (int i=1; i<=numberDarts; i++) {
			double x = Math.random();
			double y = Math.random();
			
			double distance = Math.sqrt(Math.pow(x-0.5, 2)+ Math.pow(y-0.5, 2));
			if (distance <0.5) {
				dartsInCircle++;
			}
		}
		double pi = (double)dartsInCircle/numberDarts;
		System.out.println(pi*4.0);
	}

}

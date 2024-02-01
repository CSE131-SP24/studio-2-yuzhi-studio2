package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("What is the start amount of money?");
		int startAmount = scan.nextInt();
		System.out.println("what is the win probability?");
		double winChance = scan.nextDouble();
		System.out.println("What is the win limit?");
		int winLimit = scan.nextInt();
		System.out.println("What is the number of days you'll simulate?");
		int totalSimulations = scan.nextInt();
		int daysOfRuin = 0; 
		
		
		for (int i = 1; i <= totalSimulations; i++)
		{
			int todayAmount = startAmount; 
			int count = 0; 
			while (todayAmount > 0 && todayAmount < winLimit) {
				if (Math.random() < winChance) {
					todayAmount++;
					count++; 
				} else {
					todayAmount--;
					count++; 		
				}	
			
			} if (todayAmount != 0) { 
				System.out.println("Simulation " + i + ": " + count + " win");
			} else {
				System.out.println("Simulation " + i + ": " + count + " lose");
				daysOfRuin++; 
			} 
			
			 
	}	double expectedRuin = 0;
		if (winChance == 0.5) {
		expectedRuin = 1 - (double)startAmount / winLimit; 
	} else {
		double a = (1 - winChance) / winChance; 
		expectedRuin = (Math.pow(a, startAmount) - Math.pow(a, winLimit)) / (1 - Math.pow(a, winLimit));
	}
		
		double ruinRate = (double) daysOfRuin / totalSimulations; 
		System.out.println("Ruin rate from simulation: " + ruinRate);
		System.out.println("Expected Ruin Rate: " + expectedRuin);
		
	}

}

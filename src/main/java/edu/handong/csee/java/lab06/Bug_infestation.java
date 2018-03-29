package edu.handong.csee.java.lab06;

import java.util.Scanner;
public class Bug_infestation {
	
	public static final double GROWTH_RATE = 0.95;
	public static final double ONE_BUG_VOLUME = 0.002;
	
	public static void main(String[] args) {
		double houseVolume;
		int startPopulation;
			
		Scanner keyboard = new Scanner(System.in);
			
		System.out.print("Enter the total volume of your house in cubic feet: ");
		houseVolume = keyboard.nextInt();
		
		System.out.print("Enter the estimated number of roaches in your house: ");
		startPopulation = keyboard.nextInt();
		
		int population = startPopulation;
		
		int totalBugVolume = (int)(population * GROWTH_RATE);
		double newBugVolume;
		int newBugs;
		int countWeeks = 0;
		
	    while (totalBugVolume < houseVolume){
    	    newBugs = (int)(population * GROWTH_RATE);
    	    newBugVolume = newBugs * ONE_BUG_VOLUME;
    	    population = population + newBugs;
    	    totalBugVolume = (int)(totalBugVolume + newBugVolume);
    	    countWeeks = countWeeks + 1;
        }
		
	    System.out.print("Starting with a roach population of " + startPopulation);
	    System.out.print("and a house with a volume of " + houseVolume + " cubic feet, after " + countWeeks + " weeks,");
	    System.out.print("the house will be filled with " + population + " roaches.");
	    System.out.print("They will fill a volume of " + totalBugVolume + " cubic feet");
	    System.out.print("Better call Debugging Experts Inc.");
	}
}
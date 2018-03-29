package edu.handong.csee.java.lab06;   // package name

import java.util.Scanner;   // import scanner
/**
 * This class implements a calculator that computes roach-filled time and total numbers and volume of roaches
 * @author 21700184
**/
public class Bug_infestation {
	/**
	 * GROWTH_RATE - weekly growth rate of the roach population (a constant 0.95)
	 */
	public static final double GROWTH_RATE = 0.95;   // constant value 'GROWTH_RATE'
	/**
	 * ONE_BUG_VOLUME - volume of an average roach (a constant 0.002)
	 */
	public static final double ONE_BUG_VOLUME = 0.002;   // constant value 'ONE_BUG_VOLUME'
    /**
     * houseVolume - volume of the house
     * startPopulation - initial number of roaches
     * countWeeks - week counter
     * population - current number of roaches
     * totalBugVolume - total volume of all the roaches
     * newBugs - number of roaches hated this week
     * newBugVolume - volume of new roaches
     */
	public static void main(String[] args) {   // main method
		double houseVolume;   // declare houseVolume
		int startPopulation;   // declare houseVolume
			
		Scanner keyboard = new Scanner(System.in);   // declare object 'keyboard' to use Scanner class
			
		System.out.print("Enter the total volume of your house in cubic feet: ");   // print "Enter the total volume of your house in cubic feet: "
		houseVolume = keyboard.nextInt();   // input value is houseVolume
		
		System.out.print("Enter the estimated number of roaches in your house: ");   // print "Enter the estimated number of roaches in your house: "
		startPopulation = keyboard.nextInt();   // input value is startPopulation
		
		int population = startPopulation;    // put startPopulation value to population
		
		int totalBugVolume = (int)(population * GROWTH_RATE);   // declare totalBugVolume to multiplication of population and GROWTH_RATE
		double newBugVolume;    // declare newBugVolume
		int newBugs;   // declare newBugs
		int countWeeks = 0;    // declare countWeeks
		
	    while (totalBugVolume < houseVolume){     // repeat while 'totalBugVolume < houseVolume'
    	        newBugs = (int)(population * GROWTH_RATE);   // declare newBugs to multiplication of population and GROWTH_RATE
    	        newBugVolume = newBugs * ONE_BUG_VOLUME;   // declare newBugVolume to multiplication of newBugs and ONE_BUG_VOLUME
    	        population = population + newBugs;   // add newBugs to population
    	        totalBugVolume = (int)(totalBugVolume + newBugVolume);   // declare totalBugVolume to sum of totalBugVolume and newBugVolume
    	        countWeeks = countWeeks + 1;   // add 1 to countWeeks
        }
		
	    System.out.println("Starting with a roach population of " + startPopulation);   // print start roach population
	    System.out.println("and a house with a volume of " + houseVolume + " cubic feet, after " + countWeeks + " weeks,");   // print volume of house and weeks 
	    System.out.println("the house will be filled with " + population + " roaches.");   // print roaches number when house is filled with roaches
	    System.out.println("They will fill a volume of " + totalBugVolume + " cubic feet");   // print volume of total roaches 
	    System.out.println("Better call Debugging Experts Inc.");   // print message "Better call Debugging Experts Inc."
	}
}
package edu.handong.csee.java.lab06;

import java.util.Scanner;
public class Bug_infestation {
	
	public static final double GROWTH_RATE = 0.95;
	public static final double ONE_BUG_VOLUME = 0.002;
	
	public static void main(String[] args) {
		int houseVolume;
		int startPopulation;
		Bug_infestation bug = new Bug_infestation();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the total volume of your house in cubic feet: ");
		houseVolume = keyboard.nextInt();
		
		System.out.print("Enter the estimated number of roaches in your house: ");
		startPopulation = keyboard.nextInt();
	}
}

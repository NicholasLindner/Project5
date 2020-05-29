package Yahtzee;

import java.util.ArrayList;

public class Dice {
	
	/*
	 * This method randomly generates numbers between 1 and 6 (inclusive) and adds them to
	 * an Integer ArrayList (the amount of numbers between 1 to 6 that are added are as many 
	 * as the size of the list) The list has the size of the number of rolls as 
	 * given to us by the parameter. 
	 */
	public static ArrayList<Integer> rollDice(int numOfRolls){
		
		ArrayList <Integer> dice = new ArrayList <Integer>(numOfRolls);
		
		for(int i = 0; i < dice.size(); i++){
			dice.add((int) (Math.random() * 6) + 1);
		}
		return dice;
	}
	
}


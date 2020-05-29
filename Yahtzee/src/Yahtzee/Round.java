package Yahtzee;

import java.util.ArrayList;

public class Round {

	//INSTANCE VARIABLES
	int turnCount = 0;
	ArrayList <Integer> keptDice = new ArrayList <Integer>();
	ArrayList <Integer> rolledDice = new ArrayList <Integer>();
	
	//GETTERS
	public int getKeptDice(){return keptDice.size();}
	
	/*
	 * This method takes the turn for the user by rolling the dice 
	 * and addign one to the turn count.
	 */
	public void takeTurn(){
		
		rolledDice = Dice.rollDice(5 - keptDice.size());
		turnCount++;
	}
	
	/*
	 * This method checks if the player has any
	 * turns left and returns true if they do.
	 */
	public boolean isThereTurnsLeft(){
		
		if(turnCount >= 3){
			return false;
		}
		return true;
	}
	
	/*
	 * This method returns the String version of
	 * the numbers that the player rolled.
	 */
	public String rolledDiceDisplay(){
		
		String rolled = "";
		if(rolledDice.size() == 0)	{
			return rolled;
		}
	
		for(int i = 0; i < rolledDice.size() - 1; i++){
			
			rolled += rolledDice.get(i);
			rolled += ", ";
			
		}
		rolled += rolledDice.get(rolledDice.size() - 1);
		
		return rolled;
	}
	
	/*
	 * This method returns the String version
	 * of the numbers which the players decided to
	 * keep.
	 */
	public String keptDiceDisplay(){
		
		String kept = "";
		if(keptDice.size() == 0)	{
			return kept;
		}
		for(int i = 0; i < keptDice.size() - 1; i++){
			
			kept += keptDice.get(i);
			kept += ", ";
			
		}
		kept += keptDice.get(keptDice.size() - 1);
		
		return kept;
	}
	
	/*
	 * This method allows the user to keep 
	 * the dice that they choose. To do this 
	 * it removes the dice from the rolledDice
	 * list and adds it to the keptDice list.
	 */
	public void keep(int individualDiceKept){ 
		int pos = rolledDice.indexOf(individualDiceKept);
		if(pos != -1){
			rolledDice.remove(pos);
			keptDice.add(individualDiceKept);
		}
	}
	
	/*
	 * This method allows the user to put back 
	 * the dice of their choice. It does this by removing
	 * the dice from the keptDice list and adding it 
	 * to the rolledDice list.
	 */
	public void putBack(int individualDicePutBack){ 
		
		int pos = keptDice.indexOf(individualDicePutBack);
		if(pos != -1){
			keptDice.remove(pos);
			rolledDice.add(individualDicePutBack);
		}
	}
	
	/*
	 * This method adds ones to the total depending
	 * on the number of ones the player rolled and
	 * the number of ones that they kept from before.
	 */
	public int addOnes(){
		
		int total = 0;
		
		for(int i = 0; i < rolledDice.size(); i++){
			if(rolledDice.get(i) == 1){
				total += 1;
			}
			
		}
		
		for(int i = 0; i < keptDice.size(); i++){
			if(keptDice.get(i) == 1){
				total += 1;
			}
		}
		return total;
	}
	
	/*
	 * This method adds twos to the total depending
	 * on the number of twos the player rolled and
	 * the number of twos that they kept from before.
	 */
	public int addTwos(){
			
			int total = 0;
			
			for(int i = 0; i < rolledDice.size(); i++){
				if(rolledDice.get(i) == 2){
					total += 2;
				}
				
			}
			
			for(int i = 0; i < keptDice.size(); i++){
				if(keptDice.get(i) == 2){
					total += 2;
				}
			}
			return total;
		}
	
	/*
	 * This method adds threes to the total depending
	 * on the number of threes the player rolled and
	 * the number of threes that they kept from before.
	 */
	public int addThrees(){
		
		int total = 0;
		
		for(int i = 0; i < rolledDice.size(); i++){
			if(rolledDice.get(i) == 3){
				total += 3;
			}
			
		}
		
		for(int i = 0; i < keptDice.size(); i++){
			if(keptDice.get(i) == 3){
				total += 3;
			}
		}
		return total;
	}
	
	/*
	 * This method adds fours to the total depending
	 * on the number of fours the player rolled and
	 * the number of fours that they kept from before.
	 */
	public int addFours(){
		
		int total = 0;
		
		for(int i = 0; i < rolledDice.size(); i++){
			if(rolledDice.get(i) == 4){
				total += 4;
			}
			
		}
		
		for(int i = 0; i < keptDice.size(); i++){
			if(keptDice.get(i) == 4){
				total += 4;
			}
		}
		return total;
	}
	
	/*
	 * This method adds fives to the total depending
	 * on the number of fives the player rolled and
	 * the number of ones fives they kept from before.
	 */
	public int addFives(){
		
		int total = 0;
		
		for(int i = 0; i < rolledDice.size(); i++){
			if(rolledDice.get(i) == 5){
				total += 5;
			}
			
		}
		
		for(int i = 0; i < keptDice.size(); i++){
			if(keptDice.get(i) == 5){
				total += 5;
			}
		}
		return total;
	}
	
	/*
	 * This method adds sixes to the total depending
	 * on the number of sixes the player rolled and
	 * the number of sixes that they kept from before.
	 */
	public int addSixes(){
		
		int total = 0;
		
		for(int i = 0; i < rolledDice.size(); i++){
			if(rolledDice.get(i) == 6){
				total += 6;
			}
			
		}
		
		for(int i = 0; i < keptDice.size(); i++){
			if(keptDice.get(i) == 6){
				total += 6;
			}
		}
		return total;
	}
	
	/*
	 * This method starts a new round by setting the turn count to 0,
	 * clearing the rolledDice list, and clearing the keptDice list.
	 */
	public void newRound(){
		
		turnCount = 0;
		rolledDice.clear();
		keptDice.clear();
		
	}
}

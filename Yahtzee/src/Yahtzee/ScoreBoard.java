package Yahtzee;

import java.util.ArrayList;

public class ScoreBoard {
	
	//INSTACE VARIABLES
	private ArrayList <Integer> points;
	
	//GETTERS
	public void setScore(int index, int score){if(points.get(index) == -1){points.set(index, score);}}
	public String getScoreString (int index){return Integer.toString(getScore(index));}

	//SETTERS
	public int getScore(int index){if(points.get(index) == -1){return 0;}return points.get(index);}

	/*
	 * CONSTRUCTOR: This constructor sets up the scoreboard by using a forloop to make each number's points  -1
	 * (basically setting up the initial score.
	 */
	public ScoreBoard(){
		points = new ArrayList <Integer>(6);
		for (int i = 0; i < 6; i++)
			points.add(-1);
	}
	
	/*
	 * This method checks if the 
	 */
	public boolean isSet(int index){
		if(points.get(index) == -1){
			return false;
		}
		return true;
	}
	
	/*
	 * This method returns the the number that the player
	 * is on by going through the points list and 
	 * checking when the element at index i is -1.
	 * Once the element at index i is -1, it returns the counter.
	 */
	public int roundNum(){
		int counter = 0;
		
		for(int i = 0; i < points.size(); i++){
			
			if(points.get(i) > -1){
				
				counter++;
				
			}
			
		}
		return counter;
		
	}
	
	/*
	 * This method resets the game by setting every element in the 
	 * points list to -1
	 */
	public void reset() {
		for (int i = 0; i < 6; i++)
			points.set(i, -1);
	}
	
}
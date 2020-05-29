package Yahtzee;

public class Yahtzee {
	
	//INSTANCE VARIABLES
	private Round curRound;
	private ScoreBoard scoreBoard;
	
	//GETTERS
	public int getRoundNum() {return scoreBoard.roundNum();}
	public String getScoreString (int index){return scoreBoard.getScoreString(index);}
	public String getRolledDiceDisplay(){return curRound.rolledDiceDisplay();}
	public String getKeptDiceDisplay(){return curRound.keptDiceDisplay();}
	
	//SETTERS
	public void setScore(int index, int score) {scoreBoard.setScore(index, score);}
	public void setRoll(){curRound.takeTurn();}
	public void setKeep(int individualDiceKept){curRound.keep(individualDiceKept);}
	public void setPutBack(int individualDicePutBack){ curRound.putBack(individualDicePutBack);}
	
	//CONSTRUCTOR
	public Yahtzee() {
		scoreBoard = new ScoreBoard();
		curRound = new Round();
	}
	
	/*
	 * This method applies the ones by summing together the ones, setting the 
	 * "ones score" to that sum, and starting a new round.
	 */
	public void applyOnes(){
		
		int sumOnes = curRound.addOnes();
		scoreBoard.setScore(0, sumOnes);
		curRound.newRound();
		
	}
	
	/*
	 * This method applies the twos by summing together the twos, setting the 
	 * "twos score" to that sum, and starting a new round.
	 */
	public void applyTwos(){
		
		int sumTwos = curRound.addTwos();
		scoreBoard.setScore(1, sumTwos);
		curRound.newRound();
		
	}
	
	/*
	 * This method applies the threes by summing together the threes, setting the 
	 * "threes score" to that sum, and starting a new round.
	 */
	public void applyThrees(){
		
		int sum = curRound.addThrees();
		scoreBoard.setScore(2, sum);
		curRound.newRound();
		
	}
	
	/*
	 * This method applies the fours by summing together the fours, setting the 
	 * "ones fours" to that sum, and starting a new round.
	 */
	public void applyFours(){
		
		int sum = curRound.addFours();
		scoreBoard.setScore(3, sum);
		curRound.newRound();
		
	}
	
	/*
	 * This method applies the fives by summing together the fives, setting the 
	 * "fives score" to that sum, and starting a new round.
	 */
	public void applyFives(){
		
		int sum = curRound.addFives();
		scoreBoard.setScore(4, sum);
		curRound.newRound();
		
	}
	
	/*
	 * This method applies the sixes by summing together the sixes, setting the 
	 * "sixes score" to that sum, and starting a new round.
	 */
	public void applySixes(){
		
		int sum = curRound.addSixes();
		scoreBoard.setScore(5, sum);
		curRound.newRound();
		
	}
	
	/*
	 * This method returns true if there are turns left and false otherwise.
	 */
	public boolean turnsLeft(){
		
		return curRound.isThereTurnsLeft();
		
	}
	
	/*
	 * This method returns true if the score board is set and false otherwise.
	 */
	public boolean hasNumbers(int i){
		
		return scoreBoard.isSet(i);
		
	}
	
	/*
	 * This method gets the total score by adding up the number of 
	 * points that each number. Then it returns the total.
	 */
	public int findTotalScore(){
		
		int counter = 0;
		for(int i = 0; i < 6; i++){
			
			counter = counter + scoreBoard.getScore(i);
			
		}
		return counter;
	}
	
	/*
	 * This method resets the games by setting the current round to a newRound
	 * and resetting the score board.
	 */
	public void reset() {
		curRound.newRound();
		scoreBoard.reset();
	}
	
}
package Yahtzee;

public class MainOfYahtzee {

	/*
	 * This method is the main method of the Yahtzee
	 * project. It starts the execution of the game.
	 */
	public static void main(String[] args) {
		
		Yahtzee game = new Yahtzee();
		YahtzeeFrame display = new YahtzeeFrame(game);
	}

}

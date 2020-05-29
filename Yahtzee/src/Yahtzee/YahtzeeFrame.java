package Yahtzee;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class YahtzeeFrame extends JFrame {

	//INSTANCE VARIABLE
	private Yahtzee game;
	private JLabel onesScore;
	private JButton onesBtn;
	private JLabel twosScore;
	private JButton twosBtn;
	private JLabel threesScore;
	private JButton threesBtn;
	private JLabel foursScore;
	private JButton foursBtn;
	private JLabel fivesScore;
	private JButton fivesBtn;
	private JLabel sixesScore;
	private JButton sixesBtn;
	private JButton rollBtn;
	private JLabel rolledLabel;
	private JLabel keptLabel;
	private JTextField rearrangeText;
	private JButton keepBtn;
	private JButton putBackBtn;

	/*
	 * CONSTRUCTOR: This constructor initializes the game
	 * instance variable and sets up the entire GUI frame
	 * using a grid layout to put everything in the
	 * correct place.
	 */
	public YahtzeeFrame(Yahtzee game) {
		this.game = game;
		
		onesScore = new JLabel("0");
		onesBtn = new JButton("Ones");
		onesBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				onOnesClicked();
			}
		});
		twosScore = new JLabel("0");
		twosBtn = new JButton("Twos");
		twosBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				onTwosClicked();
			}
		});
		threesScore = new JLabel("0");
		threesBtn = new JButton("Threes");
		threesBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				onThreesClicked();
			}
		});
		foursScore = new JLabel("0");
		foursBtn = new JButton("Fours");
		foursBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				onFoursClicked();
			}
		});
		fivesScore = new JLabel("0");
		fivesBtn = new JButton("Fives");
		fivesBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				onFivesClicked();
			}
		});
		sixesScore = new JLabel("0");
		sixesBtn = new JButton("Sixes");
		sixesBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				onSixesClicked();
			}
		});

		rollBtn = new JButton("Roll");
		rollBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				onRollClicked();
			}
		});
		rolledLabel = new JLabel("");
		keptLabel = new JLabel("");
		rearrangeText = new JTextField(1);
		keepBtn = new JButton("Keep");
		keepBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				onKeepClicked();
			}
		});
		putBackBtn = new JButton("Put Back");
		putBackBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				onPutBackClicked();
			}
		});

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		panel.setLayout(new GridLayout(13, 4));
		
		panel.add(Box.createHorizontalGlue());
		panel.add(new JLabel("POINTS:"));
		panel.add(Box.createHorizontalGlue());
		panel.add(Box.createHorizontalGlue());

		panel.add(new JLabel("Ones:"));
		panel.add(onesScore);
		panel.add(Box.createHorizontalGlue());
		panel.add(Box.createHorizontalGlue());
		panel.add(new JLabel("Twos:"));
		panel.add(twosScore);
		panel.add(Box.createHorizontalGlue());
		panel.add(Box.createHorizontalGlue());
		panel.add(new JLabel("Threes:"));
		panel.add(threesScore);
		panel.add(Box.createHorizontalGlue());
		panel.add(Box.createHorizontalGlue());
		panel.add(new JLabel("Fours:"));
		panel.add(foursScore);
		panel.add(Box.createHorizontalGlue());
		panel.add(Box.createHorizontalGlue());
		panel.add(new JLabel("Fives:"));
		panel.add(fivesScore);
		panel.add(Box.createHorizontalGlue());
		panel.add(Box.createHorizontalGlue());
		panel.add(new JLabel("Sixes:"));
		panel.add(sixesScore);
		panel.add(Box.createHorizontalGlue());
		panel.add(Box.createHorizontalGlue());

		panel.add(rollBtn);
		panel.add(Box.createHorizontalGlue());
		panel.add(Box.createHorizontalGlue());
		panel.add(Box.createHorizontalGlue());
		panel.add(new JLabel("Rolled:"));
		panel.add(rolledLabel);
		panel.add(Box.createHorizontalGlue());
		panel.add(Box.createHorizontalGlue());
		panel.add(new JLabel("Kept:"));
		panel.add(keptLabel);
		panel.add(Box.createHorizontalGlue());
		panel.add(Box.createHorizontalGlue());

		panel.add(new JLabel("Rearrange:"));
		panel.add(rearrangeText);
		panel.add(keepBtn);
		panel.add(putBackBtn);

		panel.add(onesBtn);
		panel.add(twosBtn);
		panel.add(threesBtn);
		panel.add(Box.createHorizontalGlue());
		panel.add(foursBtn);
		panel.add(fivesBtn);
		panel.add(sixesBtn);
		panel.add(Box.createHorizontalGlue());
		
		add(panel);
		setSize(500, 400);
		setVisible(true);
		setTitle("Yahtzee");
	}

	/*
	 * This method sets a roll and updates the game when the Roll button is clicked.
	 */
	private void onRollClicked() {
		game.setRoll();
		update();
	}
	
	/*
	 * This method sets the dice that the user chose to kept and updates the game when the keep button is pressed.
	 */
	private void onKeepClicked() {
		try{
			int heldDice = Integer.parseInt(rearrangeText.getText());
			game.setKeep(heldDice);
			update();
		}
		catch(java.lang.NumberFormatException e){
			rearrangeText.setText("");
		}
	}
	
	/*
	 * This method puts back the dice that the user chose, updates the game, and checks if the game is finished when the 
	 * put back button is clicked.
	 */
	private void onPutBackClicked() {
		try{
			int putBackDice = Integer.parseInt(rearrangeText.getText());
			game.setPutBack(putBackDice);
			update();
			checkFinsihed();
		}
		catch(java.lang.NumberFormatException e){
			rearrangeText.setText("");
		}
	}
	
	/*
	 * This method applies the ones, updates the game, and checks if the game is finished
	 */
	private void onOnesClicked() {
		game.applyOnes();
		update();
		checkFinsihed();
	}
	
	/*
	 * This method applies the twos, updates the game, and checks if the game is finished
	 */
	private void onTwosClicked() {
		game.applyTwos();
		update();
		checkFinsihed();
	}
	
	/*
	 * This method applies the threes, updates the game, and checks if the game is finished
	 */
	private void onThreesClicked() {
		game.applyThrees();
		update();
		checkFinsihed();
	}
	
	/*
	 * This method applies the fours, updates the game, and checks if the game is finished
	 */
	private void onFoursClicked() {
		game.applyFours();
		update();
		checkFinsihed();
	}
	
	/*
	 * This method applies the fives, updates the game, and checks if the game is finished
	 */
	private void onFivesClicked() {
		game.applyFives();
		update();
		checkFinsihed();
	}
	
	/*
	 * This method applies the sizes, updates the game, and checks if the game is finished
	 */
	private void onSixesClicked() {
		game.applySixes();
		update();
		checkFinsihed();
	}
	
	@SuppressWarnings("deprecation")
	
	/*
	 * This method updates the game by setting each of the scores
	 * for the numbers (1 - 6), setting the rolled label text, setting
	 * the kept label text, enabling the roll button, and enabling the
	 * number buttons (1-6).
	 */
	private void update(){
		
		onesScore.setText(game.getScoreString(0));
		twosScore.setText(game.getScoreString(1));
		threesScore.setText(game.getScoreString(2));
		foursScore.setText(game.getScoreString(3));
		fivesScore.setText(game.getScoreString(4));
		sixesScore.setText(game.getScoreString(5));

		rolledLabel.setText(game.getRolledDiceDisplay());
		keptLabel.setText(game.getKeptDiceDisplay());

		rollBtn.setEnabled(game.turnsLeft() && game.getRoundNum() < 6);
		
		onesBtn.setEnabled(!game.hasNumbers(0));
		twosBtn.setEnabled(!game.hasNumbers(1));
		threesBtn.setEnabled(!game.hasNumbers(2));
		foursBtn.setEnabled(!game.hasNumbers(3));
		fivesBtn.setEnabled(!game.hasNumbers(4));
		sixesBtn.setEnabled(!game.hasNumbers(5));
	}
	
	/*
	 * This method checks if the game is finished by
	 * seeing if the round number is greater than 5.
	 * If it is, is tells the user that the game ended,
	 * shows them their score, resets the game, and 
	 * updates the game.
	 */
	private void checkFinsihed() {
		if(game.getRoundNum() > 5){
			
			Window.msg("You have finished the game. Here is your total score: " + game.findTotalScore());
			Window.msg("RESTARTING GAME");
			game.reset();
			update();
		}
	}
	
}

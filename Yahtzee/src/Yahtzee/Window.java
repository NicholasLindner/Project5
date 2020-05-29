package Yahtzee;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window {

	/*
	 * This method creates a message.
	 */
	public static void msg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	/*
	 * This method creates a panel which has a label, text field, and 
	 * an OK option. It returns the text that the user typed in when 
	 * they press the OK button. It returns null otherwise (this would
	 * only happen when the user clicks the x button at the top right
	 * to exit the game). 
	 */
	public String getUserInput(String text, String title){
		String[] options = {"OK"};
		JPanel panel = new JPanel();
		JLabel lbl = new JLabel(text);
		JTextField txt = new JTextField(10);
		panel.add(lbl);
		panel.add(txt);
		int selectedOption = JOptionPane.showOptionDialog(null, panel, title, JOptionPane.NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options , options[0]);

		if(selectedOption == 0)
		    return txt.getText();
		return null;
	}
	
}


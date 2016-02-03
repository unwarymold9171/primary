package english.random;

import java.awt.*;
import javax.swing.*;
import core.GuiBuild;
import english.random.actions.*;

public class Random {
	//JFrame build
	public static GuiBuild uiRandom = new GuiBuild("Random", SystemColor.menu, 100, 100, 500, 325, false);
	
	//Text fields for the frame
	private static JTextArea intorductionText;
	private static JTextArea playerScoreText;
	private static JTextArea computerScoreText;
	public static JTextArea playerScore;
	public static JTextArea computerScore;
	public static JTextArea console;
	//Buttons for the frame
	private static JButton cooperate; 
	private static JButton defect;
	//Variables
	public static boolean cooperation = true;
	public static int scorePlayer = 0;
	public static int scoreComputer = 0;
	//Action Listeners
	private final static Action cooperateAction = new CooperateAction();
	private final static Action defectAction = new DefectAction();
	
	//Assembly for the GUI
	public static void randomUI(){
		//System.out.println("\u300c" + "\u300d");
		
		//Introduction Text Field
		intorductionText = new JTextArea();
		intorductionText.setBackground(uiRandom.getGUIColor());
		intorductionText.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)); //make it look nice
		intorductionText.setEditable(false);
		intorductionText.setText("Click on eather the Cooperate or \nDefect buttons");
		intorductionText.setBounds(10, 10, 210, 30);
		uiRandom.addToContentPane(intorductionText);
		
		//Player's Score Text Display Text
		playerScoreText = new JTextArea();
		playerScoreText.setBackground(uiRandom.getGUIColor());
		playerScoreText.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)); //make it look nice
		playerScoreText.setEditable(false);
		playerScoreText.setText("Your Score:");
		playerScoreText.setBounds(10, 50, 100, 20);
		uiRandom.addToContentPane(playerScoreText);
		
		//The Computer's Score Text Display Text
		computerScoreText = new JTextArea();
		computerScoreText.setBackground(uiRandom.getGUIColor());
		computerScoreText.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)); //make it look nice
		computerScoreText.setEditable(false);
		computerScoreText.setText("Opponent's Score:");
		computerScoreText.setBounds(110, 50, 100, 20);
		uiRandom.addToContentPane(computerScoreText);
		
		//The Player's score Display
		playerScore = new JTextArea();
		playerScore.setBackground(uiRandom.getGUIColor());
		playerScore.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)); //make it look nice
		playerScore.setEditable(false);
		playerScore.setText("" + scorePlayer);
		playerScore.setBounds(10, 70, 100, 20);
		uiRandom.addToContentPane(playerScore);
		
		//The Computers score Display
		computerScore = new JTextArea();
		computerScore.setBackground(uiRandom.getGUIColor());
		computerScore.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)); //make it look nice
		computerScore.setEditable(false);
		computerScore.setText("" + scoreComputer);
		computerScore.setBounds(110, 70, 100, 20);
		uiRandom.addToContentPane(computerScore);
		
		//Console Display
		console = new JTextArea();
		console.setBackground(Color.white);
		console.setEditable(false);
		console.setText("");
		console.setLineWrap(true);
		console.setBounds(225, 10, 250, 200);
		uiRandom.addToContentPane(console);
		
		//Cooperate Button
		cooperate = new JButton("Cooperate"); 
		cooperate.setBounds(20, 220, 200, 50);
		cooperate.setAction(cooperateAction);
		uiRandom.addToContentPane(cooperate);
		
		//Defect Button
		defect = new JButton("Defect");
		defect.setBounds(270, 220, 200, 50);
		defect.setAction(defectAction);
		uiRandom.addToContentPane(defect);
	}
	
}

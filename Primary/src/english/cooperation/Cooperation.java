package english.cooperation;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextArea;
import core.GuiBuild;
import english.cooperation.actions.CooperateAction;
import english.cooperation.actions.DefectAction;

public class Cooperation {
	//JFrame build
	public static GuiBuild uiCooperation = new GuiBuild("Always Coopearting", SystemColor.menu, 100, 100, 500, 325, false, false);
	
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
	
	
	public static void cooperationUI() {
		//System.out.println("\u300c" + "\u300d");
		
		//Introduction Text Field
		intorductionText = new JTextArea();
		intorductionText.setBackground(uiCooperation.getGUIColor());
		intorductionText.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)); //make it look nice
		intorductionText.setEditable(false);
		intorductionText.setText("Click on eather the Cooperate or \nDefect buttons");
		intorductionText.setBounds(10, 10, 210, 30);
		uiCooperation.addToContentPane(intorductionText);
		
		//Player's Score Text Display Text
		playerScoreText = new JTextArea();
		playerScoreText.setBackground(uiCooperation.getGUIColor());
		playerScoreText.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)); //make it look nice
		playerScoreText.setEditable(false);
		playerScoreText.setText("Your Score:");
		playerScoreText.setBounds(10, 50, 100, 20);
		uiCooperation.addToContentPane(playerScoreText);
		
		//The Computer's Score Text Display Text
		computerScoreText = new JTextArea();
		computerScoreText.setBackground(uiCooperation.getGUIColor());
		computerScoreText.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)); //make it look nice
		computerScoreText.setEditable(false);
		computerScoreText.setText("Opponent's Score:");
		computerScoreText.setBounds(110, 50, 100, 20);
		uiCooperation.addToContentPane(computerScoreText);
		
		//The Player's score Display
		playerScore = new JTextArea();
		playerScore.setBackground(uiCooperation.getGUIColor());
		playerScore.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)); //make it look nice
		playerScore.setEditable(false);
		playerScore.setText("" + scorePlayer);
		playerScore.setBounds(10, 70, 100, 20);
		uiCooperation.addToContentPane(playerScore);
		
		//The Computers score Display
		computerScore = new JTextArea();
		computerScore.setBackground(uiCooperation.getGUIColor());
		computerScore.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)); //make it look nice
		computerScore.setEditable(false);
		computerScore.setText("" + scoreComputer);
		computerScore.setBounds(110, 70, 100, 20);
		uiCooperation.addToContentPane(computerScore);
		
		//Console Display
		console = new JTextArea();
		console.setBackground(Color.white);
		console.setEditable(false);
		console.setText("");
		console.setLineWrap(true);
		console.setBounds(225, 10, 250, 200);
		uiCooperation.addToContentPane(console);
		
		//Cooperate Button
		cooperate = new JButton("Cooperate"); 
		cooperate.setBounds(20, 220, 200, 50);
		cooperate.setAction(cooperateAction);
		uiCooperation.addToContentPane(cooperate);
		
		//Defect Button
		defect = new JButton("Defect");
		defect.setBounds(270, 220, 200, 50);
		defect.setAction(defectAction);
		uiCooperation.addToContentPane(defect);
	}
}
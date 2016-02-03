package english;

import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextArea;
import core.GuiBuild;
import english.action.*;

public class EnglishGUI {
	//GUI initial set up
	private static GuiBuild uiMain = new GuiBuild("English 12 MultiGenenera Project", SystemColor.menu, 100, 100, 500, 325, false);
	//Text Areas
	private static JTextArea intorductionText;
	//Buttons for the frame
	private static JButton randomExicute; 
	private static JButton titFotTatExicute;
	//Action Listeners
	private final static Action exicuteRandom = new ExicuteRandom();
	private final static Action exicuteTitForTat = new ExicuteTitForTat();
	
	//build
	private static void uiMain(){
		intorductionText = new JTextArea();
		intorductionText.setBackground(uiMain.getGUIColor());
		intorductionText.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)); //make it look nice
		intorductionText.setEditable(false);
		intorductionText.setText("Click on which type of Prisoner's Dilemma you would like to try out.");
		intorductionText.setBounds(10, 10, 480, 30);
		uiMain.addToContentPane(intorductionText);
		
		randomExicute = new JButton("Random Selection"); 
		randomExicute.setBounds(10, 50, 200, 20);
		randomExicute.setAction(exicuteRandom);
		uiMain.addToContentPane(randomExicute);
		
		titFotTatExicute = new JButton("Random Selection"); 
		titFotTatExicute.setBounds(10, 70, 200, 20);
		titFotTatExicute.setAction(exicuteTitForTat);
		uiMain.addToContentPane(titFotTatExicute);
	}
	
	public static void main(String[] args){
		uiMain();
		uiMain.setVisible(true);
	}
}
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
	private static GuiBuild uiMain = new GuiBuild("English 12 MultiGenenera Project", SystemColor.menu, 100, 100, 500, 325, false, true);
	//Text Areas
	private static JTextArea intorductionText;
	//Buttons for the frame
	private static JButton randomExicute; 
	private static JButton titFotTatExicute;
	private static JButton betrailExicute;
	private static JButton cooperateExicute;
	//Action Listeners
	private final static Action exicuteRandom = new ExicuteRandom();
	private final static Action exicuteTitForTat = new ExicuteTitForTat();
	private final static Action exicuteBetrail = new ExicuteBetrail();
	private final static Action exicuteCooperate = new ExicuteCooperate();
	
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
		
		betrailExicute = new JButton("Random Selection"); 
		betrailExicute.setBounds(10, 90, 200, 20);
		betrailExicute.setAction(exicuteBetrail);
		uiMain.addToContentPane(betrailExicute);
		
		cooperateExicute = new JButton("Random Selection"); 
		cooperateExicute.setBounds(10, 110, 200, 20);
		cooperateExicute.setAction(exicuteCooperate);
		uiMain.addToContentPane(cooperateExicute);
		
		
	}
	
	public static void main(String[] args){
		uiMain();
		uiMain.setVisible(true);
	}
}

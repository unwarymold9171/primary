package english.betrail.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import english.betrail.Betrail;

public class DefectAction extends AbstractAction {
	private static final long serialVersionUID = 8904835033875829026L;
	public DefectAction() {
		putValue(NAME, "Defect");
	}
	public void actionPerformed(ActionEvent e) {
		Betrail.console.setText("");
		if(!Betrail.cooperation){
			Betrail.console.append("You Defected and have been awarded \n 5 points\n");
			Betrail.console.append("Opponent Cooperated and has been \n awarded 0 points\n");
			Betrail.scorePlayer += 5;
			Betrail.scoreComputer += 0;
		} else {
			Betrail.console.append("You Defected and have been awarded \n 1 points\n");
			Betrail.console.append("Opponent Defected and has been \n awarded 1 points\n");
			Betrail.scorePlayer += 1;
			Betrail.scoreComputer += 1;
		}
		
		Betrail.playerScore.setText("" + Betrail.scorePlayer);
		Betrail.computerScore.setText("" + Betrail.scoreComputer);
	}
}
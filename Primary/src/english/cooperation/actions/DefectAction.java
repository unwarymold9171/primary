package english.cooperation.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import english.cooperation.Cooperation;


public class DefectAction extends AbstractAction {
	private static final long serialVersionUID = 8904835033875829026L;
	public DefectAction() {
		putValue(NAME, "Defect");
	}
	public void actionPerformed(ActionEvent e) {
		Cooperation.console.setText("");
		if(Cooperation.cooperation){
			Cooperation.console.append("You Defected and have been awarded \n 5 points\n");
			Cooperation.console.append("Opponent Cooperated and has been \n awarded 0 points\n");
			Cooperation.scorePlayer += 5;
			Cooperation.scoreComputer += 0;
		} else {
			Cooperation.console.append("You Defected and have been awarded \n 1 points\n");
			Cooperation.console.append("Opponent Defected and has been \n awarded 1 points\n");
			Cooperation.scorePlayer += 1;
			Cooperation.scoreComputer += 1;
		}
		
		Cooperation.playerScore.setText("" + Cooperation.scorePlayer);
		Cooperation.computerScore.setText("" + Cooperation.scoreComputer);
	}
}
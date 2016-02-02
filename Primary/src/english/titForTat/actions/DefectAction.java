package english.titForTat.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import english.titForTat.TitForTat;

public class DefectAction extends AbstractAction {
	private static final long serialVersionUID = 8904835033875829026L;
	public DefectAction() {
		putValue(NAME, "Defect");
	}
	public void actionPerformed(ActionEvent e) {
		TitForTat.console.setText("");
		if(TitForTat.repeat){
			TitForTat.console.append("You Defected and have been awarded \n 5 points\n");
			TitForTat.console.append("Opponent Cooperated and has been \n awarded 0 points\n");
			TitForTat.scorePlayer += 5;
			TitForTat.scoreComputer += 0;
		} else {
			TitForTat.console.append("You Defected and have been awarded \n 1 points\n");
			TitForTat.console.append("Opponent Defected and has been \n awarded 1 points\n");
			TitForTat.scorePlayer += 1;
			TitForTat.scoreComputer += 1;
		}
		
		TitForTat.repeat = false;
		TitForTat.playerScore.setText("" + TitForTat.scorePlayer);
		TitForTat.computerScore.setText("" + TitForTat.scoreComputer);
	}
}
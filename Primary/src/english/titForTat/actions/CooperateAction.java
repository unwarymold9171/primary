package english.titForTat.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import english.titForTat.TitForTat;

public class CooperateAction extends AbstractAction{
	private static final long serialVersionUID = 2619586580438014477L;
	public CooperateAction() {
		putValue(NAME, "Cooperate");
	}
	public void actionPerformed(ActionEvent e) {
		TitForTat.console.setText("");
		if(TitForTat.repeat){
			TitForTat.console.append("You Cooperated and have been awarded \n 3 points\n");
			TitForTat.console.append("Opponent Cooperated and has been \n awarded 3 points\n");
			TitForTat.scorePlayer += 3;
			TitForTat.scoreComputer += 3;
		} else {
			TitForTat.console.append("You Cooperated and have been awarded \n 0 points\n");
			TitForTat.console.append("Opponent Defected and has been \n awarded 5 points\n");
			TitForTat.scorePlayer += 0;
			TitForTat.scoreComputer += 5;
		}
		
		TitForTat.repeat = true;
		TitForTat.playerScore.setText("" + TitForTat.scorePlayer);
		TitForTat.computerScore.setText("" + TitForTat.scoreComputer);
	}
}
package english.betrail.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import english.betrail.Betrail;

public class CooperateAction extends AbstractAction{
	private static final long serialVersionUID = 2619586580438014477L;
	public CooperateAction() {
		putValue(NAME, "Cooperate");
	}
	public void actionPerformed(ActionEvent e) {
		Betrail.console.setText("");
		if(!Betrail.cooperation){
			Betrail.console.append("You Cooperated and have been awarded \n 3 points\n");
			Betrail.console.append("Opponent Cooperated and has been \n awarded 3 points\n");
			Betrail.scorePlayer += 3;
			Betrail.scoreComputer += 3;
		} else {
			Betrail.console.append("You Cooperated and have been awarded \n 0 points\n");
			Betrail.console.append("Opponent Defected and has been \n awarded 5 points\n");
			Betrail.scorePlayer += 0;
			Betrail.scoreComputer += 5;
		}
		
		Betrail.playerScore.setText("" + Betrail.scorePlayer);
		Betrail.computerScore.setText("" + Betrail.scoreComputer);
	}
}

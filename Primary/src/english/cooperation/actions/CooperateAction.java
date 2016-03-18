package english.cooperation.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

import english.cooperation.Cooperation;

public class CooperateAction extends AbstractAction{
	private static final long serialVersionUID = 2619586580438014477L;
	public CooperateAction() {
		putValue(NAME, "Cooperate");
	}
	public void actionPerformed(ActionEvent e) {
		Cooperation.console.setText("");
		if(Cooperation.cooperation){
			Cooperation.console.append("You Cooperated and have been awarded \n 3 points\n");
			Cooperation.console.append("Opponent Cooperated and has been \n awarded 3 points\n");
			Cooperation.scorePlayer += 3;
			Cooperation.scoreComputer += 3;
		} else {
			Cooperation.console.append("You Cooperated and have been awarded \n 0 points\n");
			Cooperation.console.append("Opponent Defected and has been \n awarded 5 points\n");
			Cooperation.scorePlayer += 0;
			Cooperation.scoreComputer += 5;
		}
		
		Cooperation.playerScore.setText("" + Cooperation.scorePlayer);
		Cooperation.computerScore.setText("" + Cooperation.scoreComputer);
	}
}

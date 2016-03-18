package english.action;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import english.cooperation.Cooperation;

public class ExicuteCooperate extends AbstractAction{
	private static final long serialVersionUID = -8666570797720824202L;
	public ExicuteCooperate() {
		putValue(NAME, "Always Cooperating");
	}
	public void actionPerformed(ActionEvent e) {
		Cooperation.cooperationUI();
		Cooperation.uiCooperation.setVisible(true);
	}
}

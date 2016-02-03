package english.action;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import english.betrail.Betrail;

public class ExicuteBetrail extends AbstractAction{
	private static final long serialVersionUID = 2619586580438014477L;
	public ExicuteBetrail() {
		putValue(NAME, "Random Selection");
	}
	public void actionPerformed(ActionEvent e) {
		Betrail.betrailUI();
		Betrail.uiBetrail.setVisible(true);
	}
}

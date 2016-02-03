package english.action;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import english.titForTat.TitForTat;

public class ExicuteTitForTat extends AbstractAction{
	private static final long serialVersionUID = 2619586580438014477L;
	public ExicuteTitForTat() {
		putValue(NAME, "Tit-For-Tat");
	}
	public void actionPerformed(ActionEvent e) {
		TitForTat.titfortat();
		TitForTat.tft.setVisible(true);
	}
}

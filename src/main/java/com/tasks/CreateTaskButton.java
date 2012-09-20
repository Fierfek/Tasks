package main.java.com.tasks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class CreateTaskButton extends JButton implements ActionListener{
	Panes pane;
	
	CreateTaskButton(Panes panes) {
		addActionListener(this);
		this.setText("NEW TASK");
		pane = panes;
	}
	
	public void actionPerformed(ActionEvent ae) {
		pane.add(new CreateTaskPanel(), 2);
	}
}
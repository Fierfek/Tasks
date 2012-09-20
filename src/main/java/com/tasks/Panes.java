package main.java.com.tasks;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panes extends JLayeredPane {
	JPanel lower; 
	JPanel buttonPanel;
	JPanel menuPanel;
	
	Panes() {
		setBounds(0, 0, Frame.width, Frame.height);
		setLayout(new BorderLayout());
		setVisible(true);
		setupTaskPanel();
	}
	
	private void setupTaskPanel() {
		lower = new JPanel();
		GridLayout buttonGL = new GridLayout();
		buttonGL.setColumns(1);
		buttonGL.setRows(8);
		
		GridLayout menuGL = new GridLayout();
		menuGL.setColumns(2);
		
		menuPanel = new JPanel();
		menuPanel.setPreferredSize(new Dimension(300, 50));
		menuPanel.setLayout(menuGL);
		menuPanel.add(new CreateTaskButton(this));
		lower.add(menuPanel, BorderLayout.NORTH);
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(buttonGL);
		lower.add(buttonPanel, BorderLayout.CENTER);
		
		add(lower, BorderLayout.CENTER, 0);
	}
}

package main.java.com.tasks;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Frame extends JFrame{
	static int width = 300;
	static int height = 500;
	Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(new Dimension(width, height));
		setResizable(false);
		setTitle("Task Manager");
		
		add(new Panes(), BorderLayout.CENTER);
	}
}

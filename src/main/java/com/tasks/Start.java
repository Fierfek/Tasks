package main.java.com.tasks;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Start {
	
	JFrame frame;
	JPanel buttonPanel;
	JPanel menuPanel;
	
	Start() {
		setupFrame();
		setupTaskPanel();
	}
	
	private void setupFrame() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(new Dimension(300, 500));
		frame.setTitle("Task Manager");
	}
	
	private void setupTaskPanel() {
		GridLayout buttonGL = new GridLayout();
		buttonGL.setColumns(1);
		buttonGL.setRows(8);
		
		GridLayout menuGL = new GridLayout();
		menuGL.setColumns(2);
		
		menuPanel = new JPanel();
		menuPanel.setPreferredSize(new Dimension(300, 50));
		menuPanel.setLayout(menuGL);
		frame.add(menuPanel, BorderLayout.NORTH);
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(buttonGL);
		frame.add(buttonPanel, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new Start();
	}
}

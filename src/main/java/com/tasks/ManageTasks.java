package main.java.com.tasks;

import java.util.ArrayList;
import java.util.List;

public class ManageTasks {
	List<Task> tasks = new ArrayList<Task>();
	
	ManageTasks() {
		
	}
	
	class Task {
		String name;
		String description;
		int importance;
		
		Task(String n, String d, int i) {
			name = n;
			description = d;
			importance = i;
		}
	}
	
	void createTask(String name) {
		createTask(name, "", 0);
	}
	
	void createTask(String name, String desc) {
		createTask(name, desc, 0);
	}
	
	void createTask(String name, int importance) {
		createTask(name, "", importance);
	}
	
	void createTask(String name, String desc, int importance) {
		new Task(name, desc, importance);
	}
}

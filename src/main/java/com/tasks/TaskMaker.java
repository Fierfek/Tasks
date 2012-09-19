package main.java.com.tasks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskMaker {
	List<Task> tasks = new ArrayList<Task>();
	
	TaskMaker() {
		this(null, null, null);
	}
	
	TaskMaker(Date d) {
		this(d, null, null);
	}
	
	TaskMaker(String name) {
		this(null, name, null);
	}

	TaskMaker(Date d, String name) {
		this(d, name, null);
	}
	
	TaskMaker(String name, String det) {
		this(null, name, det);
	}
	
	TaskMaker(Date d, String name, String det) {
		Task t = new Task(d, name, det);
		tasks.add(t);
	}
	
	private class Task {
		private Date date;
		private String name;
		private String details;
		
		Task(Date d, String n, String det) {
			date = d;
			name = n;
			details = det;
		}
	}
}


public class Assignment {

	public static void main(String[] args) {
		Task[] tasks = new Task[] {
			new Task("Finish Homework", 2, true),
			new Task()
		};
		
		for(int i=0; i<tasks.length; i++) {
			System.out.println(tasks[i]);
		}
	}
	
	static String getElement(String values[], int index) { 
		//the assignment didn't have the first parameter as an array, but it seemed like it should be
		if(index<0 || index>=values.length) {
			return "";
		}
		else {
			return values[index];
		}
	}

}

class Task {
	String description;
	int dueInDays;
	boolean complete;
	
	Task(String description, int dueInDays, boolean complete) {
		this.description = description;
		this.dueInDays = dueInDays;
		this.complete = complete;
	}
	
	Task() {
		this("Needs description", 0, false);
	}
	
	public String toString() {
		return "Task - Description: " + description + ", Due in: " + dueInDays + 
				" days, Complete: " + complete;
	}
}

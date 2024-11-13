package com.tns.ifet.daysixteen.queue;
import java.util.PriorityQueue;
public class Task implements Comparable<Task> {
	private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority1() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        // Higher priority tasks will have lower values
        return Integer.compare(other.getPriority1(), this.priority);
    }

	public String getPriority() {
		// TODO Auto-generated method stub
		return null;
	}
}

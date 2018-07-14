package chapterThree;

import java.util.Arrays;

public class StackMin {
	private int pointer;
	private int pointMin;
	private int[] stack;
	private int[] mins;
	
	public StackMin() {
		this.pointer = 0;
		this.pointMin = 0;
		this.stack = new int[150];
		this.mins = new int[150];
	}
	
	public boolean isEmpty() {
		if(this.pointer == 0)
			return true;
		else
			return false;
	}
	
	public void push(int x) {
		if(isEmpty()) {
			this.mins[pointMin] = x;
			this.stack[pointer] = x;
			this.pointMin++;
			this.pointer++;
		}
		else {
			if(x <= mins[pointMin - 1]) {
				this.mins[pointMin] = x;
				this.pointMin++;
			}
			this.stack[pointer] = x;
			this.pointer++;
		}
	}
	
	public int pop() {
		
	}
	
	public int peek() {

	}
	
	public int min() {

	}
}

package chapter3;

import java.util.Arrays;

public class ArrayThreeStack {
	//Question 3.1: One array 3 stacks, use 3 differents ints as stack pointers, they would keep track of the current
	//stack positions. We would take, depending on which stack we want to push it on, we would take that number and
	//add pointer*3 to it for the array position.
	//push(int x, int stackNumber) would make pointer go ++ then place it at stackNumber + pointer#*3
	//pop(int stackNumber) would make pointer save stackNumber + pointer#*3 then pointer#--, then return
	//peek(stackNumber) just return stackNumber + pointer#*3
	//isEmpty(stackNumber) just return if if pointer# is zero
	
	//if size above limit, double the size of array;
	
	private int[] pointers;
	private int[] stacks;
	
	public ArrayThreeStack() {
		this.pointers = new int[3];
		Arrays.fill(this.pointers, 0);
		this.stacks = new int [150];
	}
	
	public boolean isEmpty(int stackNumber) {
		if(this.pointers[stackNumber] == 0)
			return true;
		else
			return false;
	}
	
	public void push(int x, int stackNumber) {
		//could add a few lines to double array size
		this.stacks[stackNumber + (pointers[stackNumber] * 3)] = x;
		this.pointers[stackNumber]++;
	}
	
	public int pop(int stackNumber) {
		if(isEmpty(stackNumber)) {
			System.out.println("Stack is empty");
			return Integer.MIN_VALUE;
		}
		//no need to set it to 0, pointer is our source of truth
		this.pointers[stackNumber]--;
		return this.stacks[stackNumber + (this.pointers[stackNumber] * 3)];
	}
	
	public int peek(int stackNumber) {
		if(isEmpty(stackNumber)) {
			System.out.println("Stack is empty");
			return Integer.MIN_VALUE;
		}
		return this.stacks[stackNumber + (this.pointers[stackNumber] * 3 - 3)];
	}
	
}

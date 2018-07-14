package chapterThree;

import java.util.Stack;

public class SortStacks {
	public void sortStacks(Stack<Integer> stack) {
		Stack<Integer> temp = new Stack<Integer>();
		while(!stack.isEmpty()) {
			int tmp = stack.pop();
			while(!temp.isEmpty() && temp.peek() > tmp) {
				stack.push(tmp);
			}
			temp.push(tmp);
		}
		while(!temp.isEmpty())
			stack.push(temp.pop());
	}	
}
	

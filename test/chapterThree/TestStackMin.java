package chapterThree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStackMin {

	@Test
	void test() {
		StackMin stack = new StackMin();
		stack.push(1);
		stack.push(5);
		stack.push(2);
		stack.push(3);
		stack.push(0);
		stack.push(7);
		stack.push(2);
		
		assertEquals(0, stack.min());
		stack.pop();
		stack.pop();
		stack.pop();
		assertEquals(1, stack.min());
		
	}

}

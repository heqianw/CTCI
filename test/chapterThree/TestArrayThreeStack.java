package chapterThree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestArrayThreeStack {

	@Test
	void test() {
		ArrayThreeStack stacks = new ArrayThreeStack();
		assertEquals(true, stacks.isEmpty(0));
		assertEquals(true, stacks.isEmpty(1));
		assertEquals(true, stacks.isEmpty(2));
		
		stacks.push(1, 0);
		stacks.push(2, 0);
		stacks.push(3, 0);
		
		stacks.push(11, 1);
		stacks.push(12, 1);
		stacks.push(13, 1);
		
		stacks.push(21, 2);
		stacks.push(22, 2);
		stacks.push(23, 2);
		
		assertEquals(3, stacks.peek(0));
		assertEquals(13, stacks.peek(1));
		assertEquals(23, stacks.peek(2));
		
		assertEquals(3, stacks.pop(0));
		assertEquals(13, stacks.pop(1));
		assertEquals(23, stacks.pop(2));
		
		assertEquals(2, stacks.peek(0));
		assertEquals(12, stacks.peek(1));
		assertEquals(22, stacks.peek(2));
		
		assertEquals(2, stacks.pop(0));
		assertEquals(12, stacks.pop(1));
		assertEquals(22, stacks.pop(2));
	}

}

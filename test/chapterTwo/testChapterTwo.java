package chapterTwo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class testChapterTwo {

	@Test
	void testRemoveDup() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(6);
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(8);
		assertEquals(ChapterTwo.removeDup(list).toString(), "[5, 6, 3, 7, 8]");
	}
	//Quesiton 2.2 is trivial without a linked node class
	
	//Quesiton 2.3

}

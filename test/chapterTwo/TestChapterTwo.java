package chapterTwo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import chapter2.ChapterTwo;
import chapter2.LinkedNode;


class TestChapterTwo {

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
	@Test
	void testKToLast() {
		LinkedNode n = new LinkedNode(5);
		n.appendTotail(6);
		n.appendTotail(7);
		n.appendTotail(8);
		n.appendTotail(9);
		n.appendTotail(10);
		assertEquals(10, ChapterTwo.kToLast(n, 0).data);
		assertEquals(9, ChapterTwo.kToLast(n, 1).data);
		assertEquals(5, ChapterTwo.kToLast(n, 5).data);
	}
	
	//Quesiton 2.3 will do after linked node class
	@Test
	void testDeleteNode() {
		LinkedNode n = new LinkedNode(5);
		n.appendTotail(6);
		n.appendTotail(7);
		n.appendTotail(8);
		n.appendTotail(9);
		n.appendTotail(10);
		LinkedNode buffer = n.next.next;
		ChapterTwo.deletNode(buffer);
		assertEquals(5, n.data);
		n = n.next;
		assertEquals(6, n.data);
		n = n.next;
		assertEquals(8, n.data);
		n = n.next;
		assertEquals(9, n.data);
		n = n.next;
		assertEquals(10, n.data);
	}
	@Test
	void testPartition() {
		LinkedNode n = new LinkedNode(3);
		n.appendTotail(6);
		n.appendTotail(4);
		n.appendTotail(7);
		n.appendTotail(1);
		n.appendTotail(5);
		n = ChapterTwo.partition(n, 5);
		/*while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}*/
	}
	@Test
	void testSumList() {
		LinkedNode one = new LinkedNode(7);
		one.appendTotail(1);
		one.appendTotail(6);
		LinkedNode two = new LinkedNode(5);
		two.appendTotail(9);
		two.appendTotail(2);
		LinkedNode sum = ChapterTwo.sumLists(one, two);
		while(sum != null) {
			System.out.println(sum.data);
			sum = sum.next;
		}
		
	}
	@Test
	void testPalindrome() {
		
	}
}

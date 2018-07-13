package chapterTwo;

import java.util.HashSet;
import java.util.LinkedList;

public class ChapterTwo {
	//Question 2.1: Remove Duplicate 
	public static LinkedList<Integer> removeDup(LinkedList<Integer> list) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < list.size(); i++) {
			if(!set.contains(list.get(i))){
				set.add(list.get(i));
			}
			else {
				list.remove(i);
			}
		}
		return list;
	}
	//if we only had a linkedlist node class, in order to remove a node, we would simply change the node.next 
	//reference from the next node to the node after that one
	
	//FOLLOW UP: do it without buffer, but that would require comparing every element to the rest of the list
	//That would be O(n^2) complexity
	
	//Question 2.2:
	/*public static int kToLast(LinkedList<Integer> list, int k){
		return list.get(list.size() - k - 1);
	}*/
	public static LinkedNode kToLast(LinkedNode head, int k) {
		LinkedNode one = head;
		LinkedNode two = head;
		int counter = 0;
		while(one.hasNext(one)) {
			if(counter >= k) {
				one = one.next;
				two = two.next;
			}
			else {
				one = one.next;
			}
			counter++;
		}
		return two;
	}
	//without a linked node class, this solution is trivial, using the linked node, we would
	//simply have the linkedlist iterate with two runners with k distance between them. we return the second
	//runner after the first runner reaches the node with no more next
	
	//Question 2.3:
	/*public static void deleteNode(LinkedList<Integer> list, int k) {
		for(int i = k - 1; i < list.size() - 1; i++) {
			list.set(i + 1, list.get(i));
		}
	}*/
	
	public static void deletNode(LinkedNode n) {
		while(n.next != null) {
			n.data = n.next.data;
			n = n.next;
		}
	}
	//if we had a linked node class, we would just move the vales backwards, replacing the node k by the next one,
	//and onwards until we reach the end. worst case of O(n)
	
	//Question 2.4:
	public static LinkedNode partition (LinkedNode head, int x) {
		if(head.next == null) {
			return head;
		}
		if(head.next.next == null) {
			if(head.data > head.next.data) {
				head.next.next = head;
				head.next = null;
			}
			return head;
		}
		LinkedNode n = head.next;
		LinkedNode previous = head;
		while(n.next != null) {
			if(n.data < x) {
				previous.next = n.next;
				n.next = head;
				head = n;
				n = previous.next;
			}
			else {
				previous = n;
				n = n.next;
			}
		}
		n.next = null;
		return head;
	}
	
	
	
}

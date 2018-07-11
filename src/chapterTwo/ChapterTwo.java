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
	public static int kToLast(LinkedList<Integer> list, int k){
		return list.get(list.size() - k - 1);
	}
	//without a linked node class, this solution is trivial, using the linked node, we would
	//simply have the linkedlist iterate with two runners with k distance between them. we return the second
	//runner after the first runner reaches the node with no more next
	
	//Question 2.3:
	public static void deleteNode(LinkedList<Integer> list, int k) {
		for(int i = k - 1; i < list.size() - 1; i++) {
			list.set(i + 1, list.get(i));
		}
	}
	//if we had a linked node class, we would just move the vales backwards, replacing the node k by the next one,
	//and onwards until we reach the end. worst case of O(n)
	
	//Question 2.4:
	
}

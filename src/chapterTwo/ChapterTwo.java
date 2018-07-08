package chapterTwo;

import java.util.HashSet;
import java.util.LinkedList;

public class ChapterTwo {
	//Question 2.1: 
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
}

package chapterTwo;

public class LinkedNode {
	//bad practice but for the purpose of simplifying the exercise, must set it as public
	public LinkedNode next = null;
	public int data;
	
	public LinkedNode(int d) {
		this.data = d;
		next = null;
	}
	
	public boolean hasNext(LinkedNode n) {
		if(n.next != null)
			return true;
		return false;
	}
	
	public void appendTotail(int d) {
		LinkedNode end = new LinkedNode(d);
		LinkedNode n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	public LinkedNode deleteNode(LinkedNode head, int d) {
		LinkedNode n = head;
		if(n.data == d)
			return head.next;
		while(n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
}

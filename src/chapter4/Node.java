package chapter4;

public class Node {
	private int value;
	private Node[] children;
	
	public Node(int value) {
		this.value = value;
		this.children = new Node[0];
	}
	
	public void addChildren(Node newChild) {
		this.children = new Node[this.children.length + 1];
		this.children[this.children.length - 1] = newChild;
	}
	
	public int getValue() {
		return this.value;
	}
	//nodes whose parent is deleted and which cluster has no more
	//connection with main branch might eventually get cleaned up
	//by garbage collection?
}

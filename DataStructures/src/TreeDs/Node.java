package TreeDs;

public class Node 
{
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

class Main
{
	public static void main(String[] args)
	{
		Node node=new Node(10);
		node.left=new Node(20);
		node.right=new Node(30);
		node.left.left=new Node(40);
		node.left.right=new Node(50);
		System.out.println();
	}
}

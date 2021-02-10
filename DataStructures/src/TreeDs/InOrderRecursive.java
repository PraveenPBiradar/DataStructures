package TreeDs;

class NodeInOrder 
{
	int data;
	Node left;
	Node right;

	public NodeInOrder(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

public class InOrderRecursive 
{
	public static void main(String[] args) {
		Node node=new Node(10);
		node.left=new Node(20);
		node.right=new Node(30);
		node.left.left=new Node(40);
		node.left.right=new Node(50);
		inOrder(node);
	}

	private static void inOrder(Node node) {

		if(node==null)
		{
			return;
		}
		if(node!=null)
		{
			inOrder(node.left);
			System.out.print(node.data+" ");
			inOrder(node.right);
		}
	}
}


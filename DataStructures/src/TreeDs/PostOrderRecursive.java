package TreeDs;

public class PostOrderRecursive {
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
	
	public static void main(String[] args) {
		Node node=new Node(10);
		node.left=new Node(20);
		node.right=new Node(30);
		node.left.left=new Node(40);
		node.left.right=new Node(50);
		postOrder(node);
	}
	
	private static void postOrder(Node root) {
		if(root==null)
		{
			return;
		}
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}

}

package TreeDs;

public class NodesAtDistanceK {
	public static void main(String[] args)
	{
		Node node=new Node(10);
		node.left=new Node(20);
		node.right=new Node(30);
		node.left.left=new Node(40);
		node.left.right=new Node(50);

		int k=2;
		nodesAtDis(node,k);
	}

	private static void nodesAtDis(Node root, int k) {
		if(root==null) {
			return;
		}
		if(k==0) {
			System.out.print(root.data+" ");
		}
		else {
			nodesAtDis(root.left,k-1);
			nodesAtDis(root.right,k-1);
		}

	}
}

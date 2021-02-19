package TreeDs;

public class HeightOfBT {
	public static void main(String[] args) {
		NodeH root=new NodeH(10);
		root.left=new NodeH(8);
		root.right=new NodeH(12);
		root.right.right=new NodeH(16);
		root.right.left=new NodeH(13);
		int val=height(root);
		System.out.println(val);
	}

	private static int height(NodeH root) {
		if(root==null) {
			return 0;
		}
		else {
			return Math.max(height(root.left), height(root.right))+1;
		}
		
	}

}

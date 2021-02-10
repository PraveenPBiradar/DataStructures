package TreeDs;

import java.util.*;

public class InorderIterative {

	public List<Integer> inorderTraversal(Node root) {
		List<Integer> list=new ArrayList<Integer>();
		Stack<Node> stack=new Stack<Node>();

		while(!stack.isEmpty() || root!=null){
			while(root!=null)
			{
				stack.push(root);
				root=root.left; 
			}
			root=stack.pop();
			list.add(root.data);
			root=root.right;
		}
		return list;
	}
}



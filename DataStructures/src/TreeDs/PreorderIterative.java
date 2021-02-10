package TreeDs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderIterative {

	public List<Integer> preorderIterative(Node root) {
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

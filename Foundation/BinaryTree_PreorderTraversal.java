package Foundation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class TreeNode1 {
	int val;
	TreeNode1 left;
	TreeNode1 right;
	TreeNode1 (int x) {val = x;}
}

public class BinaryTree_PreorderTraversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		
		// Removing braces and splitting by comma
		input = input.substring(1,input.length()-1);
		String[] nodes = input.split(",\\s*");
		
		//Constructing the tree
		TreeNode root = buildTree(nodes);
		System.out.println(preorderTraversal(root));
	}
	
	public static TreeNode buildTree(String[] nodes) {
		if(nodes.length == 0 || nodes[0].equals("nul")) {
			return null;
		}
			
			
		TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int i = 1;
		
		while(i<nodes.length && !queue.isEmpty()) {
			TreeNode current = queue.poll();
			
			// Left child
			if(i < nodes.length && !nodes[i].equals("null")) {
				current.left = new TreeNode(Integer.parseInt(nodes[i]));
				queue.add(current.left);
			}
			i++;
			
			if(i < nodes.length && !nodes[i].equals("null")) {
				current.right = new TreeNode(Integer.parseInt(nodes[i]));
				queue.add(current.right);
			}
			i++;
		}
		return root;
	}
	
	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		
		preorderHelper(root,result);
		return result;
	}
	
	public static void preorderHelper(TreeNode node, List<Integer> result) {
		if(node == null) {
			return;
		}
		
		result.add(node.val);
		
		preorderHelper(node.left,result);
		
		preorderHelper(node.right,result);
	}
}

//[1,null,2,3]
//[1, 2, 3]

//[1,2,3,4,5,null,8,null,null,6,7,9]
//[1, 2, 4, 5, 6, 7, 3, 8, 9]


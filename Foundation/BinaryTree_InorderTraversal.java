package Foundation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class TreeNode2 {
	int val;
	TreeNode2 left;
	TreeNode2 right;
	TreeNode2 (int x) {val = x;}
}

public class BinaryTree_InorderTraversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		
		// Removing braces and splitting by comma
		input = input.substring(1,input.length()-1);
		String[] nodes = input.split(",\\s*");
		
		//Constructing the tree
		TreeNode root = buildTree(nodes);
		System.out.println(inorderTraversal(root));
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
	
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		
		inorderHelper(root,result);
		return result;
	}
	
	public static void inorderHelper(TreeNode node, List<Integer> result) {
		if(node == null) {
			return;
		}
				
		inorderHelper(node.left,result);
		
		result.add(node.val);
		
		inorderHelper(node.right,result);
	}
}

//[1,null,2,3]
//[1, 2, 3]

//[1,2,3,4,5,null,8,null,null,6,7,9]
//[4, 2, 6, 5, 7, 1, 3, 9, 8]



package Foundation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode4 {
	int val;
	TreeNode4 left;
	TreeNode4 right;
	TreeNode4 (int x) {val = x;}
}

public class BinaryTree_MaxDepth {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine().trim();
			
			// Removing braces and splitting by comma
			input = input.substring(1,input.length()-1);
			String[] nodes = input.split(",\\s*");
			
			//Constructing the tree
			TreeNode root = buildTree(nodes);
			System.out.println(maxDep(root));
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
		
		public static int maxDep(TreeNode root) {
			if(root == null) {
				return 0;
			}
			
			int leftDepth = maxDep(root.left);
			int rightDepth = maxDep(root.right);
			
			return Math.max(leftDepth, rightDepth) + 1;
		}
}

//[3,9,20,null,null,15,7]
//3

//[1,null,2]
//2


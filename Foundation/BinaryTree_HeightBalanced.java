package Foundation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTree_HeightBalanced {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        // Sample input: 3,9,20,null,null,15,7
	        String input = sc.nextLine();
	        input = input.replaceAll("\\[|\\]", ""); // Remove brackets
	        String[] nodes = input.split(",");

	        // Trim spaces and process input
	        for (int i = 0; i < nodes.length; i++) {
	            nodes[i] = nodes[i].trim();
	        }

	        TreeNode root = buildTree(nodes);
	        System.out.println(isBalanced(root));
	}
	
	public static TreeNode buildTree(String[] nodes) {
        if (nodes.length == 0 || nodes[0].equals("null"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (!queue.isEmpty() && i < nodes.length) {
            TreeNode current = queue.poll();

            // Left child
            if (i < nodes.length && !nodes[i].equals("null")) {
                TreeNode left = new TreeNode(Integer.parseInt(nodes[i]));
                current.left = left;
                queue.offer(left);
            }
            i++;

            // Right child
            if (i < nodes.length && !nodes[i].equals("null")) {
                TreeNode right = new TreeNode(Integer.parseInt(nodes[i]));
                current.right = right;
                queue.offer(right);
            }
            i++;
        }
        return root;
    }

    // Function to check if tree is balanced
    public static boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    public static int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int left = checkHeight(node.left);
        if (left == -1) return -1;

        int right = checkHeight(node.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1)
            return -1;

        return Math.max(left, right) + 1;
    }
}

//[3,9,20,null,null,15,7]

//true


//[1,2,2,3,3,null,null,4,4]

//false


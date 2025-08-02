package Foundation;

import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTree_FromLevelOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nodes = new int[7];
        for (int i = 0; i < 7; i++) {
            nodes[i] = sc.nextInt();
        }

        Node root = createTree(nodes);
        printTree(root);
    }

    public static Node createTree(int[] vec) {
        Node[] treeNodes = new Node[vec.length];

        // Step 1: Create all nodes
        for (int i = 0; i < vec.length; i++) {
            treeNodes[i] = new Node(vec[i]);
        }

        // Step 2: Link children to parents (complete binary tree rule)
        for (int i = 0; i < vec.length; i++) {
            int leftIdx = 2 * i + 1;
            int rightIdx = 2 * i + 2;

            if (leftIdx < vec.length) {
                treeNodes[i].left = treeNodes[leftIdx];
            }
            if (rightIdx < vec.length) {
                treeNodes[i].right = treeNodes[rightIdx];
            }
        }

        return treeNodes[0]; // root
    }

    public static void printTree(Node root) {
        if (root == null) return;

        System.out.println(root.data);       // Visit root
        printTree(root.left);                // Traverse left
        printTree(root.right);               // Traverse right
    }
}

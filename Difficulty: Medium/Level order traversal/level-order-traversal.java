/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*//*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Tree Node class usually provided by GFG
class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return level order traversal as a list of lists
    ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                Node node = q.poll();      // Remove from queue
                level.add(node.data);      // Add value to current level
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            res.add(level);  // Add current level to result
        }

        return res;
    }
}

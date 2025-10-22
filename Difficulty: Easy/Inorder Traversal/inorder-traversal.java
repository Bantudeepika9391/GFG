/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
// User function Template for Java

class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    void inorder(Node root, ArrayList<Integer> res) {
        if (root == null) return;

        inorder(root.left, res);    // Visit left subtree
        res.add(root.data);         // Visit root
        inorder(root.right, res);   // Visit right subtree
    }
}

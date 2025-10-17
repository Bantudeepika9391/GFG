// User function Template for Java

/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution {
    public static Node reverseBetween(int l, int r, Node head) {
        // code here
         if (head == null || l == r)
            return head;

        Node p = new Node(0);
        p.next = head;
       Node pev = p;
         for (int i = 0; i < l - 1; i++) {
            pev = pev.next;
        }

        Node cur = pev.next;

        
        for (int i = 0; i < r - l; i++) {
            Node next = cur.next;
            cur.next = next.next;
            next.next = pev.next;
            pev.next = next;
        }

        return p.next;
    }
}
/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        Node s=head,f=head;
         while(f!=null && f.next!=null){
             f=f.next.next;
             s=s.next;
         }
         return s.data;
    }
}
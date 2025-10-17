/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
         if(head==null) return head;
        Node cur=head;
       Node next=null;
        Node pev=null;
        while(cur!=null){
            next=cur.next;
            cur.next=pev;
            pev=cur;
            cur=next;
        }
        return pev;
    }
}
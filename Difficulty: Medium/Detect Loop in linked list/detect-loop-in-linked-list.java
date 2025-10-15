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
    public boolean detectLoop(Node head) {
        // code here
        Node s=head;
        Node f=head;
      //  ListNode f,s;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(f==s){
                return true;
            }
        }
        return false;
    }
}
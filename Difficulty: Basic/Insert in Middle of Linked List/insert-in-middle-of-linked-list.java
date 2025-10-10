/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        if(head==null)
         return new Node(x);
        Node s=head,f=head;
        while(f.next!=null && f.next.next != null){
            f=f.next.next;
            s=s.next;
        }
  Node newNode = new Node(x);

       
        newNode.next = s.next;
        s.next = newNode;

        return head;

    }
}
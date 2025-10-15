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
    public Node swapKth(Node head, int k) {
        // code here
       
        if(head==null){
            return head;
        }
       Node curr=head;
        for(int i=1;i<k;i++){
           // curr=curr.next;
           if(curr.next!=null){
            curr=curr.next;
           }
           else{
            return head;
           }
        }
        Node p=curr,q=head;
        while(curr.next!=null){
            q=q.next;
            curr=curr.next;
        }
  int a=p.data;
        p.data=q.data;
        q.data=a;
        
        
        return head;

    }
}

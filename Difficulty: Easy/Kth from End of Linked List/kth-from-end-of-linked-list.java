/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int n) {
        
        // Your code here
        if(head==null) return -1;
         
        Node s=head;
        Node f=head;
        for(int i=0;i<n;i++){
         if(f!=null)
           f=f.next;
         else
           return -1;
        }
        while(f!=null){
            f=f.next;
            s=s.next;
        }
        
        return s.data;
    
    }
}
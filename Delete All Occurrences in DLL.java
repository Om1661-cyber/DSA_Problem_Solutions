/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
        if(head == null){
            return null;
        }
        
        Node temp = head;
        
        while(temp != null){
            if(temp.data == x){
                if(temp == head){
                    head = head.next;
                }
                
                Node prevpoint = temp.prev;
                Node nextnode = temp.next;
                
                if(nextnode != null) nextnode.prev = prevpoint;
                if(prevpoint !=null) prevpoint.next = nextnode;
                
                temp = nextnode;
            }else{
                
            temp = temp.next;
            }
            
        }
        
        return head;
    }
}
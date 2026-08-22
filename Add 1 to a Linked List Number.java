/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    
    public Node reverse(Node head){
       
        Node prev = null;
        Node curr = head;
        Node nnext = null;
        
        while(curr != null){
            nnext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nnext;
          
            
        }
       
        return prev;
        
    }
    public Node addOne(Node head) {
        // code here.
        if(head == null){
            return head;
        }
        Node newhead = reverse(head);
        Node temp = newhead;
        int c = 1;
        while(temp != null){
            if(c == 1){
                int sum = temp.data + c;
                temp.data = sum %10;
                c = sum / 10;
            
                
            }else {
                break;
            }
            temp = temp.next;
        }
        Node nhead = reverse(newhead);
        
        if(c == 1){
            Node first = new Node(1);
            first.next = nhead;
            nhead = first;
        }
        
        return nhead;
    }
}
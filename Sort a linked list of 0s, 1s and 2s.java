/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        if(head == null || head.next == null){
            return head;
        }
        Node zerohead = new Node(-1);
        Node onehead = new Node(-1);
        Node twohead = new Node(-1);
        
        Node zero = zerohead;
        Node one = onehead;
        Node two = twohead;
        Node temp = head;
        
        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = temp;
            }else if(temp.data == 1){
                one.next = temp;
                one = temp;
            }else if(temp.data == 2){
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        if(onehead.next != null){
            zero.next = onehead.next;
        }else{
            zero.next = twohead.next;
        }
        one.next = twohead.next;
        two.next = null;
        Node newhead = zerohead.next;
        return newhead;
    }
}
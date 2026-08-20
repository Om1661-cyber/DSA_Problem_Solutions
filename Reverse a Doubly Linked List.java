/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        //Optimal
        if(head == null || head.next == null){
            return head;
        }
        Node curr = head;
        Node last = curr.prev;
        
        while(curr != null){
            last = curr.prev;
            curr.prev = curr.next;
            curr.next = last;
            curr = curr.prev;
        }
        head = last.prev;
        
        return head;
        // Brute Forcce Using Stack
        // if(head == null || head.next == null){
        //     return head;
        // }
        // Deque<Integer>st = new ArrayDeque<>();
        // Node temp = head;
        
        // while(temp != null){
        //     st.push(temp.data);
        //     temp = temp.next;
        // }
        // temp = head;
        // while(temp != null){
        //     temp.data = st.peek();
        //     st.pop();
        //     temp = temp.next;
        // }
        // return head;
    }
}
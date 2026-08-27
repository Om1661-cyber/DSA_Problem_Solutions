/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // // code here
        
        //Optimal
        
        if(head == null || head.next == null){
            return -1;
        }
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow.data;
            }
        }
        
        return -1;
        
        // Brute Force
        // if(head == null || head.next == null){
        //     return -1;
        // }
        
        // HashMap<Node, Integer> mp = new HashMap<>();
        
        // Node temp = head;
        
        // while(temp != null){
        //     if(mp.containsKey(temp)){
        //         return temp.data;
        //     }
        //     mp.put(temp, 1);
        //     temp = temp.next;
        // }
        
        // return -1;
    }
}
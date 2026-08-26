/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        if(head == null || head.next == null){
            return 0;
        }
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                int count = 1;
                fast = fast.next;
                while(fast != slow){
                    fast = fast.next;
                    count ++;
                    
                }
                return count;
            }
            
        }
        return 0;
       
       // Brute Force
        // if(head == null || head.next == null){
        //     return 0;
        // }
        // HashMap<Node, Integer> map = new HashMap<>();
        
        // Node temp = head;
        // int pos = 0;
        
        // while(temp != null){
         
        //  if(map.containsKey(temp)){
        //      return pos - map.get(temp);
        //  }   
         
        //  map.put(temp, pos);
         
        //  temp = temp.next;
        //  pos ++;
        // }
        
        // return 0;
    }
}
/* Structure of Doubly Linked List Node
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}; */

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        if(head == null){
            return ans;
        }
        
        Node right = head;
        Node left = head;
        
        while(right.next != null){
            right = right.next;
        }
        
        while(left != right && left.prev != right){
            if(left.data + right.data == target){
               ArrayList<Integer> pair = new ArrayList<>();
               pair.add(left.data);
               pair.add(right.data);
               ans.add(pair);
               
                left = left.next;
                right = right.prev;
            }else if(left.data + right.data > target){
                right = right.prev;
            }else{
                left = left.next;
            }
        }
        return ans;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    private ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return prev;
}
    public boolean isPalindrome(ListNode head) {
     
     if(head == null){
        return false;
     }
     ListNode slow = head;
     ListNode fast = head;

     while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
     }

     ListNode newHead = reverse(slow.next);
     ListNode temp = head;
     ListNode temp1 = newHead;
     while(temp1 != null){
        if(temp.val != temp1.val){
            reverse(newHead);
            return false;
        }
        temp = temp.next;
        temp1 = temp1.next;
     }
     reverse(newHead);
     return true;
    
   

    }
}


// Brute Force 1
 //  ArrayList <Integer> arr = new ArrayList <>();
    //     ListNode temp = head;
    //     while(temp != null){
    //         arr.add(temp.val);
    //         temp = temp.next;
    //     }
    
    //     int left = 0;
    //     int right = arr.size() - 1;

    //     while(left < right){
    //         if(arr.get(left) != arr.get(right)){
    //                 return false;
    //         }
    //         left ++;
    //         right --;

    //     }
    //     return true;


// Brute Force 2
    //  Deque<Integer> stack = new ArrayDeque <>();
    //  ListNode temp = head;
    //  while(temp != null){
    //     stack.push(temp.val);
    //     temp = temp.next;
    //  }
    //  temp = head;
    //  while(temp != null){
    //     if(temp.val != stack.peek()){
    //         return false;
    //     }
    //     temp = temp.next;
    //     stack.pop();
    //  }
    //  return true;
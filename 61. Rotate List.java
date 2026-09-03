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
    private ListNode findkthnode(ListNode head, int k){
        int c = 1;
        ListNode temp = head;
        while(temp != null){
          if( c == k) return temp;
            c++;
            temp = temp.next;
        }
        return null;
    }
    public ListNode rotateRight(ListNode head, int k) {
     if(head == null || head.next == null || k == 0){
        return head;
     }   
     ListNode temp = head;
     int len = 1;

     while(temp.next != null){
        temp = temp.next;
        len++;
     }
     
     k = k % len;
     if(k == 0) return head;
     temp.next = head;
     ListNode lastnode = findkthnode(head, len- k);
     head = lastnode.next;
     lastnode.next = null;

     return head;
    }
}
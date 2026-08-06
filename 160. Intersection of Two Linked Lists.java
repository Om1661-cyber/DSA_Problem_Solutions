/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

// Optimal Solution
       public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;

            if(temp1 == temp2) return temp1;
            if(temp1 == null){
                temp1 = headB;
            }
            if(temp2 == null){
                temp2 = headA;
            }
        }
        return temp1;
    }
}

// Brute Force 1
    //private ListNode collision(ListNode headA, ListNode headB,int d){


      // ListNode tem1 = headA;
       //ListNode tem2 = headB;


    //     while(d != 0){
    //         tem1 = tem1.next;
    //         d--;
    //     }
    //     while(tem1 != tem2){
    //         tem1 = tem1.next;
    //         tem2 = tem2.next;
    //     }
    //     if(tem1 == null){
    //         return null;
    //     }
    //     return tem1;
    // }
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     ListNode temp = headA;
    //     int n1 = 0;
    //     while(temp != null){
    //         n1++;
    //        temp = temp.next;
    //     }
    //     temp = headB;
    //     int n2 = 0;
    //     while(temp != null){
    //         n2 ++;
    //         temp = temp.next;
    //     }
    //     int d = 0;
    //     if(n1 > n2){
    //         d = n1 - n2;
    //         return collision(headA, headB, d);
    //     }else{
    //         d = n2 - n1;
    //         return collision(headB, headA, d);
    //     }
 

//Brute Force 2
        // HashMap<ListNode, Integer> mp = new HashMap<>();
        // ListNode temp = headA;
        // while(temp != null){
        //     mp.put(temp, temp.val);
        //     temp = temp.next;
        // }
        // temp = headB;

        // while(temp != null){
        //     if(mp.containsKey(temp)){
        //         return temp;
        //     }
        //     temp = temp.next;
        // }

        // return null;
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
    public ListNode mergeKLists(ListNode[] lists) {
         
         // optimal solution
           if (lists == null || lists.length == 0) {
            return null;
        }

        // Min Heap
        PriorityQueue<ListNode> pq =
            new PriorityQueue<>((a, b) -> a.val - b.val);

        // Put first node of every list into heap
        for (ListNode head : lists) {
            if (head != null) {
                pq.add(head);
            }
        }

        // Dummy node
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (!pq.isEmpty()) {

            // Get smallest node
            ListNode node = pq.poll();

            // Add it to result
            temp.next = node;
            temp = temp.next;

            // Add next node of the same list
            if (node.next != null) {
                pq.add(node.next);
            }
        }

        return dummy.next;
    }
}
// Brute force 2
// class Solution {
//     public ListNode mergeKLists(ListNode[] lists) {
    
    //private ListNode mergetwolist(ListNode list1, ListNode list2){
    //     ListNode dummy = new ListNode(-1);
    //     ListNode temp = dummy;

    //     while(list1 != null && list2 != null){
    //         if(list1.val <= list2.val){
    //             temp.next = list1;
    //             list1 = list1.next;
                
    //         }else{
    //             temp.next = list2;
    //            list2 = list2.next;
    //         }
    //         temp = temp.next;
    //     }
    //     if(list1 != null) temp.next = list1;
    //     if(list2 != null) temp.next = list2;

    //     return dummy.next;
    // }
    // public ListNode mergeKLists(ListNode[] lists) {
       
    //    if(lists == null || lists.length == 0){
    //     return null;
    //    }

    //    ListNode head = lists[0];

    //    for(int i = 1; i < lists.length; i++){
    //         head = mergetwolist(head,lists[i]);
    //    }

    //    return head;
  //  }
//}


// Brute Force 1
//class Solution {
  //  public ListNode mergeKLists(ListNode[] lists) {
       
        // ArrayList<Integer> arr = new ArrayList<>();

        // for(ListNode head : lists){
        //     ListNode temp = head;
        //     while(temp != null){
        //         arr.add(temp.val);
        //         temp = temp.next;
        //     }
        // }
        // Collections.sort(arr);

        // ListNode dummy = new ListNode(-1);
        // ListNode temp = dummy;
        // for(int i : arr){
        //     temp.next = new ListNode(i);
        //     temp = temp.next;
        // }
        // return dummy.next;
  //  }
//}
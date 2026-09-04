
/*
 * Structure of Linked List Node
 * class Node {
 *     int data;
 *     Node next;
 *     Node bottom;
 *
 *     Node(int x) {
 *         data = x;
 *         next = null;
 *         bottom = null;
 *     }
 * }
 */

class Solution {

    private Node merge(Node a, Node b) {

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (a != null && b != null) {

            if (a.data <= b.data) {
                temp.bottom = a;
                a = a.bottom;
            } else {
                temp.bottom = b;
                b = b.bottom;
            }

            temp = temp.bottom;
        }

        if (a != null) {
            temp.bottom = a;
        } else {
            temp.bottom = b;
        }

        return dummy.bottom;
    }

    private Node flatten(Node head, Node tail) {

        if (head == null || head == tail) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        // Find middle using next pointers
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        Node left = flatten(head, mid);
        Node right = flatten(mid.next, tail);

        return merge(left, right);
    }

    public Node flatten(Node head) {

        if (head == null) {
            return null;
        }

        // Find the last top-level node
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        return flatten(head, tail);
    }
}


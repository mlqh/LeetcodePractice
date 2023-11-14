package LinkedList;

/*
 * https://leetcode.com/problems/linked-list-cycle/description/
 * Use set to set visited, or use slow-fast pointers, based on Floyd's Cycle Detection Algorithm
 */

public class LinkedListCycle {

//  Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // public boolean hasCycle(ListNode head) {
    //     ListNode curr = head;
    //     if(curr == null) return false;
    //     HashSet<ListNode> set = new HashSet<>();

    //     while(curr != null) {
    //         if(set.contains(curr)) {
    //             return true;
    //         }
    //         set.add(curr);
    //         curr = curr.next;
    //     }
    //     return false;
    // }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }
}

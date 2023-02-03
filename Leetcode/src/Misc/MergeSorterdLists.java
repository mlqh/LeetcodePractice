package Misc;
public class MergeSorterdLists {

    // iterative solution
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null)
                return list2;
            if (list2 == null)
                return list1;

            ListNode head = new ListNode(0);
            ListNode pointer = head;

            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    pointer.next = list1;
                    list1 = list1.next;
                } else {
                    pointer.next = list2;
                    list2 = list2.next;
                }
                pointer = pointer.next;
            }

            if (list1 != null) {
                pointer.next = list1;
            } else if (list2 != null) {
                pointer.next = list2;
            }

            return head.next;
        }

        // recursive
        public ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {
            if (l1 == null)
                return l2;
            if (l2 == null)
                return l1;
            if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
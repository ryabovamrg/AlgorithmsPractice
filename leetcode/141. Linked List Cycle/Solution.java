/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// 3 -> 2 -> 0 -> 4
//      ^         |
//       ---------
// 1: 3 -> 2 -> 0 -> 4 -> 2
// 2: 3 -> 0 -> 2 -> 4 -> 0

// 3 -> 2 -> 4
//      ^     |
//       -----
// 1: 3 -> 2 -> 4 -> 2
// 2: 3 -> 4 -> 4 -> 4

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode ptr1 = head;
        ListNode ptr2 = head;

        while (ptr1 != null && ptr2 != null && ptr2.next != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if (ptr1 == ptr2)
                return true;
        }
        return false;
    }
}

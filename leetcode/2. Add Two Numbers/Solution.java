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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode res = new ListNode();
        ListNode currRes = res;
        ListNode currL1 = l1;
        ListNode currL2 = l2;

        boolean needToIncrement = false;

        while (currL1 != null && currL2 != null) {

            int sumRes = currL1.val + currL2.val;

            if (needToIncrement){
                sumRes++;
                needToIncrement = false;
            }
            if (sumRes >= 10) {
                sumRes -= 10;
                needToIncrement = true;
            }

            ListNode node = new ListNode(sumRes);
            currRes.next = node;
            currRes = currRes.next;

            currL1 = currL1.next;
            currL2 = currL2.next;
        }

        while (currL1 != null){
            int tmp = currL1.val;
            if(needToIncrement){
                tmp++;
                needToIncrement = false;
            }
            if (tmp >= 10) {
                tmp -= 10;
                needToIncrement = true;
            }

            ListNode node = new ListNode(tmp);
            currRes.next = node;
            currRes = currRes.next;
            currL1 = currL1.next;
        }

        while (currL2 != null){
            int tmp = currL2.val;
            if(needToIncrement){
                tmp++;
                needToIncrement = false;
            }
            if (tmp >= 10) {
                tmp -= 10;
                needToIncrement = true;
            }

            ListNode node = new ListNode(tmp);
            currRes.next = node;
            currRes = currRes.next;
            currL2 = currL2.next;
        }
        
        if (needToIncrement){
            ListNode node = new ListNode(1);
            currRes.next = node;
        }

        return res.next;
    }
}
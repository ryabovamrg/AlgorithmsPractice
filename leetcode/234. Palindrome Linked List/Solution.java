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
       public boolean isPalindrome(ListNode head) {
       byte[] valsArray = new byte[100000];
        ListNode currNode = head;
        int idx = 0;
        while (currNode != null){
            valsArray[idx] = (byte)(currNode.val);
            idx++;
            currNode = currNode.next;
        }
        int i = 0;
        int j = idx-1;

        while (i < idx && j > 0){
            if(valsArray[i] != valsArray[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}
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
    public ListNode middleNode(ListNode head) {
        
        byte counter = 0;
        ListNode currNode = head;
        while (currNode != null){
            counter++;
            currNode = currNode.next;
        }
        currNode = head;
        counter = (byte)(counter/2);
        for(byte i = 0; i < counter; i++){
            currNode = currNode.next;
        }
        return currNode;
    }
}
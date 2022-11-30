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

    // Solution dificulty: O(n+m)  ... n - lenght of list1, m - lenght of list2
    // Memory: O(m)

   
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        if (list1.val <= list2.val)
            return mergeOneListIntoAnother( list1,  list2);
        else
            return mergeOneListIntoAnother( list2,  list1);
    }

    // copy the contents of one list with head of insertingList into another list with head of baseList
    // given that baseList.val < insertingList.val 
    public ListNode mergeOneListIntoAnother(ListNode baseList, ListNode insertingList){
        ListNode baseListPtr = baseList;
        while (baseListPtr != null && baseListPtr.next != null){
            ListNode tmp = baseListPtr.next;
            while (insertingList != null && baseListPtr.next.val > insertingList.val){
                baseListPtr.next = new ListNode (insertingList.val, tmp);
                insertingList = insertingList.next;
                baseListPtr = baseListPtr.next;
            }

            baseListPtr = baseListPtr.next;

        }

        // copy all the contents of insertingList if there are any left
        baseListPtr.next = insertingList;

        return baseList;
    }

}
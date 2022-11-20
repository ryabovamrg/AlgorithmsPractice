//https://leetcode.com/problems/two-sum/description/

class Solution {
    public int[] twoSum(int[] nums, int target) {
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

        return res.next;
    }
}
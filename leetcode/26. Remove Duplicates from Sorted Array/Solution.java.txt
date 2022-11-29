class Solution {

    //[1, 1, 2, 2, 2, 3 , 6, 7, 7, 10]
    //[1, 2, 3, 6, 7, 10, _, _, _, _ ]

    // Using two pointers: one for looping through the array, second for rewriting the array
    // Algorithm complexity: O(n) for array of length n
    // Mrmory: O(1)

    public int removeDuplicates(int[] nums) {
        int ptr1 = 1;
        int ptr2 = 1;
        int currValue = nums[0];
        for (ptr1 = 1; ptr1 < nums.length && ptr2 < nums.length; ptr1++){
            if(nums[ptr1] > currValue){
                currValue = nums[ptr1];
                nums[ptr2] = currValue;
                ptr2++;
            }
        }
        return ptr2;
    }
}
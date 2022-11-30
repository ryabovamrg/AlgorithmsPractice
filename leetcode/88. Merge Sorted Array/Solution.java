class Solution {
        // Complexity: O(n+m)
        // Memory: O(2n+m)
        
        //  nums1 = [1,3,4,6,0,0,0], m = 4, n = 3
        //  nums2 = [2,5,8]
        //  desired: nums1 = [1,2,3,4,5,6,8]

        // Idea: using two pointes, loop through nums1 and nums2 and when found a number from nums2 to insert into nums1, shift the remeining chunk of nums1 to free a slot for insertion and then insert an element from nums2 into it

        // 1st iteration: inserting 2: nums1 =  [1,_,3,4,6,0,0]  -> [1,2,3,4,6,0,0]
        // 2nd iteration: inserting 5: nums1 =  [1,2,3,4,_,6,0]  -> [1,2,3,4,5,6,0]
        // 3rd iteration: inserting 8: nums1 =  [1,2,3,4,5,6,0]  -> [1,2,3,4,5,6,8]

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m < 1){
            System.arraycopy(nums2, 0, nums1, 0, n);   // memory copy-paste opertion with constant complexity
            return;      
        }
    
        int nums1Ptr = 0;
        int nums2Ptr = 0;
        int nums1EndPtr = m;
        while (nums1Ptr < nums1.length && nums2Ptr < nums2.length){
            while (nums2[nums2Ptr] >= nums1[nums1Ptr] && nums1Ptr < nums1.length - 1)
                nums1Ptr++;

            if (nums2[nums2Ptr] < nums1[nums1Ptr] && nums1Ptr < nums1.length - 1){
                System.arraycopy(nums1, nums1Ptr, nums1, nums1Ptr + 1, nums1EndPtr - nums1Ptr);
                nums1[nums1Ptr] = nums2[nums2Ptr];
                nums1EndPtr++;
                nums2Ptr++;
            } 
            nums1Ptr++;
        }

        if (nums1EndPtr < nums1.length)
             System.arraycopy(nums2, nums2Ptr, nums1, nums1EndPtr, nums1.length - nums1EndPtr);

    }
}
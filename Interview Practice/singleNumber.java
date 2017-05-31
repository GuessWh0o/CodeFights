/**
*
*You are given an array of integers in which every element appears twice, except for one.
*Find the element that only appears one time. Your solution should have a linear runtime complexity (O(n)). 
*Try to implement it without using extra memory.
*
*Example
*
*For nums = [2, 2, 1], the output should be
*singleNumber(nums) = 1.
*
**/

int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums)
                result ^= i;
        return result;
}


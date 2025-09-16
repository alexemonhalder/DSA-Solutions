/*
Move all zeros in nums to the end in-place, keeping the relative order of non-zero elements.

Problem: Leetcode 283- Move Zeroes
Approach: Two pointers
Time complexity: O(n)
Space complexity: O(1)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }

        for(int i=k; i<nums.length; i++){
            nums[i]=0;
        }
    }
}
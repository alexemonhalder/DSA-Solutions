/*
Find the pivot index of an integer array nums where the sum of elements 
to the left equals the sum to the right. If the index is at the start, 
left sum = 0; if at the end, right sum = 0. Return the leftmost index that satisfies this, or -1 if none exist.

Problem: Leetcode- 724. Find Pivot Index
Approach: Prefix Sum
Time Complexity: O(n)
Space Complexity: O(1)

*/

class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum=0;

        for(int num:nums){
            totalSum+=num;
        }

        int leftSum=0;
        for(int i=0; i<nums.length; i++){
            int rightSum=totalSum-leftSum-nums[i];

            if(leftSum==rightSum){
                return i;
            }

            leftSum+=nums[i];
        }
        return -1;
    }
}
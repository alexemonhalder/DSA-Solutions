/*
Given a sorted integer array, remove duplicates in-place so each unique element appears only once,
keeping their original order. Return k, the number of unique elements,
with the first k elements of the array holding these unique values. The remaining elements can be ignored.
A custom judge will verify k and the first k elements.

Problem: Leetcode 26- Remove Duplicates from Sorted Array
Approach: Two pointers
Time complexity: O(n)
Space complexity: O(1)
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;

        int i=0;

        for(int j=1; j<nums.length; j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}

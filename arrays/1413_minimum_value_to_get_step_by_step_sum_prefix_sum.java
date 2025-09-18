/* 
Given an integer array nums, find the minimum positive integer startValue such that 
the running sum of startValue plus elements of nums (from left to right) never drops below 1.

Problem: Leetcode- 1413. Minimum Value to Get Positive Step by Step Sum
Approach: Prefix sum
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int minStartValue(int[] nums) {

        int []prefix=new int[nums.length];
        int minPrefix=0;

        prefix[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

        for(int i=0; i<nums.length; i++){
            if(prefix[i]<minPrefix){
                minPrefix=prefix[i];
            }
        }

        return 1-minPrefix;

        /*why return 1-minPrefix?
           because, min + startValue >=1
            so, startValue = 1 - min;
        */
    }

}

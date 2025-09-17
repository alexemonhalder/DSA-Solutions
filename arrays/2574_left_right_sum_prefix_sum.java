/*
Given an integer array nums, compute two arrays: leftSum[i] = sum of elements before index i (0 if none), 
and rightSum[i] = sum of elements after index i (0 if none). 
Return an array answer where answer[i] = |leftSum[i] - rightSum[i]|.

Problem: Leetcode - 2574. Left and Right Sum Differences
Approach: Prefix sum
Time complexity: O(n)
Space complexity: O(n)
*/

class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int [] leftSum = new int[nums.length];
        int [] rightSum= new int[nums.length];
        int [] answer=new int [nums.length];

        leftSum[0]=0;
        rightSum[nums.length-1]=0;

        //calculating left sum (prefix sum)
        for(int i=1; i<nums.length; i++){
            leftSum[i]=leftSum[i-1]+nums[i-1];
        }

        //calculating right sum (suffix sum)
        for(int i=nums.length-2; i>=0; i--){
            rightSum[i] = rightSum[i+1]+nums[i+1];
        }

        for(int i=0; i<nums.length; i++){

            answer[i]= Math.abs(leftSum[i]-rightSum[i]);
        }

        return answer;
        
    }
}
/*
Given an integer array nums of length n, a partition is an index i where 0 <= i < n-1, 
splitting the array into two non-empty subarrays: left [0, i] and right [i+1, n-1]. 
A partition is valid if the absolute difference between the sums of the left and right subarrays is even. 
The task is to count and return the number of such valid partitions. 
This can be done efficiently by computing the total sum, maintaining a running left sum, 
and checking the difference at each index from 0 to n-2.

Problem: Leetcode- 3432. Count Partitions with Even Sum Difference
Approach: Prefix sum
Time complexity: O(n)
Space complexity: O(n)

*/


class Solution {
    public int countPartitions(int[] nums) {
        int totalSum=0;
        int n=nums.length;
        int[] prefix= new int[n];
        int suffix=0;
        int even=0;
        int answer=0;
        
        for(int i=0; i<n; i++){
            totalSum+=nums[i];
        }

        prefix[0]=nums[0];
        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

        for(int i=0; i<n-1; i++){
            suffix=totalSum - prefix[i];
           answer=Math.abs(prefix[i]-suffix);

           if(answer%2==0){
            even++;
           } 
        }
        return even;
    }
}
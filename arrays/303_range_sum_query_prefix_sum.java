/*
Implement a NumArray class that allows efficient calculation of the sum of elements 
in an integer array between two given indices. The class is initialized with an integer 
array using the constructor NumArray(int[] nums), and provides a method sumRange(int left, int right) 
that returns the sum of elements from index left to right inclusive. The goal is to handle multiple sum 
queries efficiently by preprocessing the array.

Problem: Leetcode 303. Range Sum Query - Immutable
Approach: Prefix sum
Time Complexity: O(n) for initialization, O(1) per query
Space Complexity: O(n)

*/

class NumArray {

    int[] prefix;
    public NumArray(int[] nums) {
        int n=nums.length;
        prefix=new int[n+1];

        prefix[0]=0;

        for(int i=0; i<n; i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {

        return prefix[right+1]-prefix[left];
    }
}
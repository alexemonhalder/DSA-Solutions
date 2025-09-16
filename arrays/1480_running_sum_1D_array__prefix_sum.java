/*
A running sum array has each element as the sum of all previous elements in the original array. 
Compute it by iterating and adding the previous sum. Can use a new array or update in-place.

Approach: Prefix sum
Time complexity: O(n)
Space complexity: O(1)
*/

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i]+=nums[i-1];
        }
        return nums;
        }
    }
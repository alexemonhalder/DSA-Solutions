/*
Remove all occurrences of val from nums in-place, return the count k of remaining elements,
and ensure the first k elements contain the remaining values. Order of elements doesn’t matter.

Problem: Leetcode 27- Remove Element
Approach: Two Pointers
Time complexity: O(n)
Space complexity: O(1)
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0, k=nums.length-1, temp=0;

        while(i<=k){
            if(nums[i]==val){
                temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;

                k--;
            }else{
                i++;
            }
        }

        for(int j=0; j<=k; j++){
            System.out.println(nums[j]);
        }

        return k+1;
    }
}
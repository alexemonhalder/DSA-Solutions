/*
Rearrange the array so evens come first, then odds. 
Example: [3,1,2,4] → [2,4,3,1]. Use two pointers: swap odd on left with even on right.

Problem: 905. Sort Array By Parity
Approach: Two pointers
Time complexity: O(n)
Space complexity: O(1)
*/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int L=0, R=0;
        int temp=0;


        for(R=0; R<nums.length; R++){
            if(nums[R]%2==0){
                temp=nums[R];
                nums[R]=nums[L];
                nums[L]=temp;

                L++;
            }
        }
        
        return nums;
    }
}

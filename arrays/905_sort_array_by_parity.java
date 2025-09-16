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
        int i=0, j=nums.length-1;
        int temp=0;

        while(i<j){
            if(nums[i]%2!=0 && nums[j]%2==0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            i++;
            j--;
        }
        
        return nums;
    }
}
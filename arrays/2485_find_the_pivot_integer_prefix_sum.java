/*
The problem is asking you to find a special integer x within the range from 1 to n such that the 
sum of all numbers from 1 up to x is equal to the sum of all numbers from x up to n. 
In other words, x acts as a “pivot” that balances the sequence on both sides. 
If such an integer exists, you return it; if no number satisfies this condition, you return -1.
It’s also given that there can be at most one valid pivot for any input n.

Problem: Leetcode - 2485. Find the Pivot Integer
Approach: Prefix sum
Time complexity: O(n)
Space complexity: O(1)
*/

class Solution {
    public int pivotInteger(int n) {
        int totalSum=n*(n+1)/2;

        for(int i=1; i<=n; i++){
            int left = i * (i+1) / 2;
            int right= totalSum - i* (i-1) / 2;

            if(left==right){
                return i;
            }
        }
        return -1;
    }
}

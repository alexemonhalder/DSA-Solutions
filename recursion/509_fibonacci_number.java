/*
The Fibonacci sequence is defined as F(0) = 0, F(1) = 1, 
and each subsequent number F(n) = F(n-1) + F(n-2) for n > 1. 
Given an integer n, the task is to calculate F(n).

Problem: Leetcode- 509. Fibonacci Number
Approach: Recursion
Time complexity: O(2^n)
Space complexity: O(n)
*/

class Solution {
    public int fib(int n) {

        if(n==0) return 0;
        if(n==1) return 1;

        return fib(n-1)+fib(n-2);
        
    }
}
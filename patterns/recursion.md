# Recursion Pattern

## When to Use
- Problems that can be divided into smaller subproblems of the same type.
- Useful for tree traversal, backtracking, divide and conquer, and sequence generation.

## Approach
1. Identify the base case(s) to stop recursion.
2. Define the recursive case, calling the function with smaller inputs.
3. Combine results from recursive calls if needed.
4. Return the final result.

## Example Problems
- [Fibonacci Number](../recursion/509_fibonacci_number.java)

## Complexity
- Time: Depends on the recursion tree; often O(2^n) for naive recursive solutions.
- Space: O(n) due to recursion stack.

# Prefix Sum Pattern

## When to Use
- Arrays problems requiring cumulative sums, running totals, or range sum queries.
- Often used to quickly calculate sums of subarrays or when previous elements affect the current calculation.

## Approach
1. Initialize the first element as the starting sum.
2. Iterate through the array from index 1 onward.
3. At each index, add the previous element’s sum to the current element (cumulative sum).
4. Optionally, store the results in a new array or update in-place.

## Example Problems
- [Running Sum of 1D Array](../arrays/1480_running_sum_1D_array__prefix_sum.java)
- [Range Sum Query](../arrays/303_range_sum_query_prefix_sum.java)


## Complexity
- Time: O(n)
- Space: O(1) if in-place, O(n) if using a separate array

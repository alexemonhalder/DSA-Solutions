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
- [Find Pivot Index](../arrays/724_find_pivot_index_prefix_sum.java)
- [Find the Pivot Integer](../arrays/2485_find_the_pivot_integer_prefix_sum.java)
- [Running Sum of 1D Array](../arrays/1480_running_sum_1D_array__prefix_sum.java)
- [Range Sum Query](../arrays/303_range_sum_query_prefix_sum.java)
- [Find the Highest Altitude](../arrays/1732_find_the_highest_altitude_prefix_sum.java)
- [Left and Right Sum Differences](../arrays/2574_left_right_sum_prefix_sum.java)
- [Minimum Value to Get Positive Step by Step Sum](../arrays/1413_minimum_value_to_get_step_by_step_sum_prefix_sum.java)
- [Count Partition with Even Sum Difference](../arrays/3432_Count_Partitions_with_Even_Sum_Difference.java)


## Complexity
- Time: O(n)
- Space: O(1) if in-place, O(n) if using a separate array

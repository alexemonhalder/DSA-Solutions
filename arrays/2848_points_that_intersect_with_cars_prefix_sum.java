/*
You are given a list of intervals, where each interval [start, end] represents a car parked on a number line. 
Each car occupies all the integer points between its start and end positions, inclusive. 
The task is to determine the total number of distinct integer points on the line that are covered by at least one car. 
In other words, you need to count all the points that fall within any of the given intervals without double-counting 
points that may be covered by multiple cars. For example, if one car covers points 1 to 3 and another covers 2 to 4, 
the total covered points are 1, 2, 3, and 4, resulting in a count of 4.

Problem: Leetcode- 2848. Points That Intersect With Cars
Approach: Prefix Sum
Time complexity: O(n)
Space complexity: O(1)
*/

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int [] area = new int [102];
        int start=0;
        int end=0;
        int count=0;
        int prefSum=0;

        for(int i=0; i<nums.size(); i++){
            start=nums.get(i).get(0);
            end= nums.get(i).get(1);

            area[start]++;
            area[end+1]--;
        }


        for(int i=0; i<area.length; i++){
            prefSum+=area[i];

            if(prefSum>0){
                count++;
            }
        }

        return count;
    }

}
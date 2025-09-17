/*
A biker starts a trip at altitude 0 and travels through n + 1 points. 
An array gain of length n gives the net altitude change between consecutive points. 
The task is to return the highest altitude reached during the trip.

Problem: Leetcode- 1732.Find the Highest Altitude
Approach: Prefix Sum
Space Complexity: O(1)
Time Complexity: O(n)

*/

class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int current=0;

        for(int i=0; i<gain.length; i++){
            current+=gain[i];

            max=Math.max(current,max);
        }
        return max;
    }
}
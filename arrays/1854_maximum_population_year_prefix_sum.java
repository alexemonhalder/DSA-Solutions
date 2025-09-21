/*
You are given a list of people, where each person is represented by their birth and death years 
in the form [birth, death]. The population of a particular year is defined as the number of people alive 
during that year. A person is considered alive in all years from their birth year up to, but not including, 
their death year. The task is to determine the earliest year that has the highest population among all the given years. 
In other words, you need to find the year in which the most people were alive, and if multiple years have 
the same maximum population, return the earliest one.

Problem: Leetcode - 1854. Maximum Population Year
Approach: Prefix Sum
Time complexity: O(n)
Space complexity: O(1)

*/

class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int [101];
        int birth=0;
        int death=0;
        int currentPop=0;
        int maxPop=0;
        int maxPopYear=1950;

        for(int i=0; i<logs.length; i++){
            birth=logs[i][0];
            death=logs[i][1];

            population[birth-1950]++;
            population[death-1950]--;
        }

        for(int i=0; i<population.length; i++){
            currentPop+=population[i];

            if(currentPop>maxPop){
                maxPop = currentPop;
                maxPopYear = 1950 + i;
            }
        }
        return maxPopYear;
    }
}
/* 
You are given two sorted arrays, nums1 and nums2, along with two integers, m and n, 
which represent the number of valid elements in each array. The array nums1 has a total length of m + n, 
where the first m elements contain the numbers to be merged, and the last n elements are set to 0 as placeholders. 
The array nums2 has exactly n elements. The task is to merge the two arrays into a single sorted array in 
non-decreasing order. Instead of creating and returning a new array, the merged result must be stored directly inside 
nums1, replacing the placeholder zeros and maintaining the sorted order.

Approach: Two pointers
Space complexity: O(1)
Time complexity: O(m+n)
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int p=m+n-1;

        for(int i=p; i>=0; i--){
            if(p2<0) break;

            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[i]=nums1[p1];
                p1--;
            }else{
                nums1[i]=nums2[p2];
                p2--;
            }
        }

    }
}
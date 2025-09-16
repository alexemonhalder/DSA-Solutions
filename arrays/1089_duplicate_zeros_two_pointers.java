/*
Duplicate every 0 in arr, shifting elements right. Ignore overflow beyond array length. Do it in-place, no return.

Problem: 1089. Duplicate Zeros
Approach: Two Pointer
Time complexity: O(n)
Space complexity: O(1)

*/


class Solution {
    public void duplicateZeros(int[] arr) {
        int countZero=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                countZero++;
            }
        }

        int i=arr.length-1;
        int n=arr.length;
        int j=arr.length-1+countZero;

        while(i>=0){

            if(j<n){
                arr[j]=arr[i];
            }

            if(arr[i]==0){
                j--;

                if(j<n){
                    arr[j]=0;
                }
            }

            i--;
            j--;
        }
    }
}
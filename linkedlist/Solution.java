package linkedlist;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public long maximumSubarraySum(int[] arr, int k) {

        int n = arr.length;

        int windowSum = 0;


        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        long maxSum = windowSum;


        for (int i = k; i < n; i++) {


            windowSum -= arr[i - k];


            windowSum += arr[i];


            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum;
    }
}
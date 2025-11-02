package Array;

import java.util.Arrays;

class Merger {

    public static void main(String[] args) {
        int[] nums1_1 = { 1, 2, 3, 0, 0, 0, 0 };
        int m1 = 3;
        int[] nums2_1 = { 2, 2, 3, 4 };
        int n1 = 4;
        merge(nums1_1, m1, nums2_1, n1);

    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m] = nums2[i];
            m++;

        }
        Arrays.sort(nums1);
    

    }
}
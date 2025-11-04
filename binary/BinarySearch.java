package binary;

public class BinarySearch {

    public static void main(String[] args) {
        int[] numbers = {3, 7, 12, 18, 25, 31, 39, 42, 55, 65, 72, 84, 91, 97, 105};

        int ans = binarySearch(numbers, 65);
        System.out.println(ans);  // should print 8 (index of 55)
    }

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid; // target found
            }
        }

        return -1;
    }
}

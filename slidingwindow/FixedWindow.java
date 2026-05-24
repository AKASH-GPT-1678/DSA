package slidingwindow;

public class FixedWindow {

    public long maxSum(int[] arr , int k ) {
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

    public int min_sum(int[] arr , int k){
        int n = arr.length;
        int min_sum = 0;

        for (int i = 0 ; i < k ; i++){
            min_sum += arr[i];

        }
        int windowSum =min_sum;

        for (int i = k ; i < n ; i++){
            windowSum -= arr[ i - k];
            windowSum += arr[ i];
            min_sum = Math.min(min_sum, windowSum);







        }
        return min_sum;

    }

    public double findMaxAverage(int[] nums, int k) {

        int length = nums.length;
        double windowSum = 0;
        double max_average = 0;


        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        max_average = windowSum / k;

        for (int i = k ; i <  length ; i++){

            windowSum -= nums[i - k ];
            windowSum += nums[i];
            double windowAverage  =  windowSum / k;
            max_average = Math.max(max_average, windowAverage);


        }

        return max_average;

    }
}

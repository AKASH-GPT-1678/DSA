package patterns;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {

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




}

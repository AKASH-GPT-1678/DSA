package Array;

import java.util.Arrays;

public class Square {

    public int[] sortedSquares(int[] nums) {

      for (int i = 0 ; i < nums.length ; i++){
          int output = nums[i] * nums[i];
          nums[i] = output;


      }
      Arrays.sort(nums);

      return nums;
    }
}


class Next {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2) return;


        int dip = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                dip = i;
                break;
            }
        }


        if (dip == -1) {
            reverseSpecific(nums , 0 , nums.length -1);
            return;
        }


        int swapIndex = getIndex(nums, dip);


        swap(nums, dip, swapIndex);


        reverseSpecific(nums, dip + 1, nums.length - 1);

    }

    public static int getIndex(int[] arr, int dip) {
        int val = arr[dip];

        for (int i = arr.length - 1; i > dip; i--) {
            if (arr[i] > val) {
                return i;
            }
        }

        return -1;
    }



    public static void reverseSpecific(int[] nums , int start , int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void swap(int[] nums , int i , int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}

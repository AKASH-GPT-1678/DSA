package slidingwindow;

public class VariableWindow {

    public int lengthOfLongest(int[] arr , int k ){

        System.out.println("Naamste");

        int low = 0;
        int lengthOfSubarray = 0;



        for (int high = 0 ; high < arr.length ; high++){
            int arrsum = 0;
            int subArrayLength = 0;
            if (low == 0 && high == 0){
                arrsum = arr[low];

            }

            while (low <= high){
                arrsum+= arr[low];
                subArrayLength++;

            }
            if (arrsum == k && subArrayLength > lengthOfSubarray){
                lengthOfSubarray = subArrayLength;

            }





        }

        return lengthOfSubarray;

    }
}

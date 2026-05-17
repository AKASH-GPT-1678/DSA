package patterns;

public class Winner {

    public static void main(String[] args){
        System.out.println("Dear World");

        int[] arr = {1000,1,1000};
        int solution = maxArea(arr);
        System.out.println(solution);
    }

    public static int maxArea(int[] height) {
        int max_sum = 0;
        for (int i = 0; i < height.length ; i++){
            for (int j = i+1 ; j < height.length ; j++){
                int hig = Math.min(height[i] , height[j]);
                int width =  j - i;
                int calculation = hig * width;
                if (calculation > max_sum){
                    max_sum = calculation;
                }
            }
        }
        return max_sum;
    }
}
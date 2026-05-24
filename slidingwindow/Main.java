package slidingwindow;

public class Main {
    public static void main(String[] args) {
        System.out.println("namas");

        FixedWindow window = new FixedWindow();





        VariableWindow window1 = new VariableWindow();

        int[][] testCases = {
                {1, 12, -5, -6, 50, 3},
                {5},
                {0, 4, 0, 3, 2},
                {4, 2, 1, 3, 3},
                {-1, -12, -5, -6, -50, -3}
        };

        int[] kValues = {4, 1, 1, 2, 2};

        for (int i = 0; i < testCases.length; i++) {

            int[] nums = testCases[i];
            int k = kValues[i];

            System.out.println(
                    "Test Case " + (i + 1) + " -> " +
                            window.findMaxAverage(nums, k)
            );
        }







    }
}

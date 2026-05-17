import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class General {

    public static void main(String[] args){
        System.out.println("Danish Kaneria");
    }

    public int getWinner(int[] arr, int k) {
        int temp = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        while (!map.containsValue(k)){
            if (list.get(0) > list.get(1)){
                temp = list.get(1);
                list.remove(1);
                list.add(temp);
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
            else {
                temp = list.get(0);
                list.remove(0);
                list.add(temp);
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }

        }
        int winner = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == k) {
                winner = entry.getKey();
                return entry.getKey();
            }
        }
        return winner;



    }
}

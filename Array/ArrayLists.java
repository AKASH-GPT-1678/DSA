package Array;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        array.add(60);
        array.add(70);
        array.add(80);
        array.add(90);
        array.add(100);

        for (Integer integer : array) {
            System.out.println(integer);
            
        }

        System.out.println("ArrayList");
        
    }
}

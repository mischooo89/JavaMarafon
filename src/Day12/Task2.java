package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 31; i++) {
            list.add(i);
        }
        System.out.println(list);


        for (int i = 300; i < 351; i++) {
            list.add(i);
        }System.out.println (list);
    }
}
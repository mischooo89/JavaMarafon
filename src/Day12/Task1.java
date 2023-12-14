package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Mercedes","BMW", "VW", "Porsche", "Audi"));
        list.add(2,"Tesla");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}

package Day18;

import java.util.Arrays;

public class Task2 {
    static int counter = 0;
    public static void main(String[] args) {
        String digit = "717771237";

        int [] seven = new int[digit.length()];
        for(int i=0; i<digit.length(); i++){
            seven[i] = Character.getNumericValue(digit.charAt(i));

        }System.out.println(Arrays.toString(seven));


        count7(seven,0);
        System.out.println("Number of digit 7 in array: " + counter);

    }

    public static void count7(int [] numbers, int index) {

        if (index == numbers.length) {
            return;
        }
        if (numbers[index] == 7) {
             counter++;

        }
        count7(numbers,index+1);

    }


}






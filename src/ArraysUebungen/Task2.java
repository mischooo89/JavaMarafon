package ArraysUebungen;

import java.util.Random;
public class Task2 {
    public static void main(String[] args) {


        int[] array = new int[100];

        Random random = new Random();
         int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);

        }
            int max = 0;
            for (int element : array) {
                if (element > max) {
                    max = element;
                }
            }
        System.out.println(max);

            int min = 10000;
            for (int element1 : array) {
                 if (element1 < min) {
                     min = element1;
                    }
                }
        System.out.println(min);

            int counter = 0;
            for(int element2: array){
                if (element2%10 ==0);
                counter++;
            }
        System.out.println(counter);

        int sumMax = 0;
        for(int element3: array){
            if (element3%10 ==0);
            sumMax+= element3;
        }
        System.out.println(sum);
            }
        }



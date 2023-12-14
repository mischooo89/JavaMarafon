package Day16.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        try{
            File file = new File("Test");
            Task1.printResult(file);
        }catch (FileNotFoundException e) {
            System.out.println("File wasn't found");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Массив может принять только 10 чисел, поменяй количество чисел");
        }
    }

    public static void printResult(File file) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();

        String[] numbersString = line.split(" ");

        int[] numbers = new int[10];
        int counter = 0;
        int sum = 0;
        double average;
        int index = 0;


        for(String number : numbersString){
            numbers[index++] = Integer.parseInt(number);
            sum += numbers[counter];
            counter++;


        }

        System.out.println("The sum is " + sum);
        System.out.println("Amount of digits: " + counter);

        average = (double) sum/counter;
        System.out.println("Average is: " + average);



    }
}

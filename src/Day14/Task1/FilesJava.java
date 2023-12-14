package Day14.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FilesJava {
    public static void main(String[] args) {
        File testFile = new File("Test");


        try{
           // Scanner scanner = new Scanner(testFile);
            printSumDigits(testFile);

        }catch(FileNotFoundException e){
            System.out.println("File wasn't found");
        }catch(WrongDigitNumber f){
            System.out.println("Number of digits is false");

        }

    }

    public static void printSumDigits(File file) throws FileNotFoundException, WrongDigitNumber {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();

        String [] numbersString = line.split (" ");

        if(numbersString.length != 10){
            throw new WrongDigitNumber();
        }
        System.out.println(Arrays.toString(numbersString));

        int [] numbers = new int[10];
        int counter = 0;

        for(String number : numbersString){
            numbers[counter++] = Integer.parseInt(number);
            }

                System.out.print(Arrays.toString(numbers));


        scanner.close();
    }
}

package Day15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\misch\\IdeaProjects\\YoutubeAlishev\\src\\resources\\shoes.csv");

        Scanner scanner = null;
        PrintWriter outFile = null;
        try {

            scanner = new Scanner(file);
            outFile = new PrintWriter("C:\\Users\\misch\\IdeaProjects\\YoutubeAlishev\\src\\resources\\missing_shoes.txt", StandardCharsets.UTF_8);

            while (scanner.hasNextLine()) {
                String[] wordsArray = scanner.nextLine().split(";");

                if (wordsArray.length != 3) {
                    throw new IllegalArgumentException();
                }


                if (Integer.parseInt(wordsArray[2]) == 0) {
                    String words = String.join(",", wordsArray);
                    System.out.println(words);
                    outFile.println(words);
//                  outFile.println(Arrays.toString(wordsArray));
//                  System.out.println(Arrays.toString(wordsArray).replaceAll("\\[", "").replaceAll("\\]", ""));

                }


            }


        } catch (IOException e) {
            System.out.println("Файл не найден");

        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");

        } finally {
            if (scanner != null) ;
            scanner.close();
        }
        if (outFile != null) {
            outFile.close();
        }


        //   System.out.println(Arrays.toString(wordsArray));


    }
}
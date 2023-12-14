package Day14.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File testFile = new File("people");

        try {
            List<String> parseFileToStringList = parseFileToStringList(testFile);
            System.out.println(parseFileToStringList);
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");

        }catch(IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
    }
    public static List<String> parseFileToStringList(File file) throws FileNotFoundException, IllegalArgumentException {
        List<String> parseFileToStringList = new ArrayList<>();

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            String words = scanner.nextLine();

            String[] wordsArray = words.split(" ");

            if(Integer.parseInt(wordsArray[1])<0){
                throw new IllegalArgumentException();
            }
            parseFileToStringList.add (words);
        }
        return parseFileToStringList;
    }
}

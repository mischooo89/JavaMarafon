package Day14.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static Day14.Task3.Person.parseFileToObjList;

public class Task3 {
    public static void main(String[] args) {
        File testFile = new File("people");

        try {
            List<Person> personList = parseFileToObjList(testFile);
            System.out.println(personList);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}

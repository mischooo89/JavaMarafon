package Day14.Task3;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public static List<Person> parseFileToObjList(File file) throws FileNotFoundException, IllegalArgumentException {
        List<Person> people = new ArrayList<>();


        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String words = scanner.nextLine();
            String[] arrayWords = words.split(" ");

            if (Integer.parseInt(arrayWords[1]) < 0) {
                throw new IllegalArgumentException();
            }

            Person person = new Person(arrayWords[0], Integer.parseInt(arrayWords[1]));
            people.add(person);


        }
        return people;
    }

    public String toString() {
        return "{name = " + this.name + " ,year " + this.age + "} ";
    }
}

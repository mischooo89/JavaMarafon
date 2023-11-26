package Day6.Task3;

import java.util.Random;

public class Teacher {

    String name;
    String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getName(){
        return this.name;
    }

    public String getSubject(){
        return this.subject;
    }

    public void evaluate(Student student){
        int min = 2;
        int max = 5;
        String grade = null;
        Random random = new Random();
        int value = random.nextInt((max-min)-1)+2;
        if(value == 2){
            grade = "неудовлетворительно";
        }else if (value == 3){
            grade = "удовлетворительно";
        }else if (value == 4){
            grade =  "хорошо";
        }else if (value == 5){
            grade =  "отлично";
        }

        System.out.println("Преподаватель: " + this.getName() + " оценил студента с именем " + student.name + " по предмету " + getSubject() + " на оценку " + grade);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alex", "Physics");
        teacher.setSubject("Chemistry");
        Student student= new Student("Alexei");
        teacher.evaluate(student);
    }
}

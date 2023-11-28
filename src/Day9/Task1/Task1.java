package Day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Sergey", "Cobra");
        System.out.println(student.getGroupName());
        student.printInfo();

        Teacher teacher = new Teacher("Vladimir", "Chemistry");
        System.out.println(teacher.getSubjectName());
        teacher.printInfo();
    }
}

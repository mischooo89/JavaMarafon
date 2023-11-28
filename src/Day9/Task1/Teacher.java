package Day9.Task1;

public class Teacher extends Human {
    public String subjectName;

    public Teacher(String name, String subjectName){
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName(){
        return this.subjectName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + this.name + ".");
    }

}

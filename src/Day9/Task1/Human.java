package Day9.Task1;

public class Human {
    public String name;

    public Human (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void printInfo(){
        System.out.println("Этот человек с именем " + this.name + ".");
    }
}

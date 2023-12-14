package Day12.Task5;

public class MusicArtist {

    private String name;
    private int age;


    public MusicArtist(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;

    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return " | " + "Name of the artist: " + this.name + " Age of the artist: " + this.age + " | ";
    }

}

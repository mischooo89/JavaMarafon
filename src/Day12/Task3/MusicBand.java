package Day12.Task3;

public class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }

    public void setName(){
        this.name = name;
    }

    public void setYear(){
        this.year = year;
    }

    public String toString(){
       return "Band: " + this.name + " Year: " + this.year;
    }


}

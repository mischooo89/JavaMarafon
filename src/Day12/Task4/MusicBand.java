package Day12.Task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;

    private List<String> members;

    public MusicBand(String name, int year, List<String> members){
        this.name = name;
        this.year = year;
        this.members = members;
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

    public List<String> getMembers(){
        return this.members;
    }

    public void setMembers(List<String> members){
        this.members = members;
    }

    public static void transferMembers(MusicBand x, MusicBand y){
        for(String member : x.getMembers()) {
            y.getMembers().add(member);
        }
            x.getMembers().clear();
        }



    public void printMembers(){
        System.out.println(getMembers());
    }



    public String toString(){
       return "Band: " + this.name + " Year: " + this.year;
    }


}

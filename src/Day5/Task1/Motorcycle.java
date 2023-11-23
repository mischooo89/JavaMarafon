package Day5.Task1;

public class Motorcycle {
    String model;
    String color;
    int year;

    public Motorcycle(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return this.color;
    }

    public int getYear(){
        return this.year;
    }

    public void setModel(final String model){
        this.model = model;
    }

    public void setColor(final String color){
        this.color = color;
    }

    public void setYear(final int year){
        this.year = year;
    }
}

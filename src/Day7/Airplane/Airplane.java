package Day7.Airplane;

public class Airplane {
    String manufacturer;
    int year;
    double length;
    double weight;
    double fuel;

    public Airplane(String manufacturer, int year, double length, double weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    double getFuel() {
        return this.fuel;
    }

    void info() {
        System.out.println();
        System.out.println("Самолёт");
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + "вес: " + weight + ", количество топлива в баке: " + this.fuel);
    }


    public double fillUp(int n) {
        return this.fuel += n;
    }


    public static void compareAirplanes(Airplane a, Airplane b){
        if(a.length > b.length){
            System.out.println("Самолет A длиннее Самолета Б");
        }else {
            System.out.println("Самолет Б длиннее Самолета А");
        }
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2012, 31.0,112);
        Airplane airplane2 = new Airplane ("Antonow", 2005, 36.0,119.0);
        compareAirplanes(airplane,airplane2);

    }

}
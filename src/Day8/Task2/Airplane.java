package Day8.Task2;

public class Airplane {
    String manufacturer;
    int year;
    double length;
    double weight;
    double fuel;

    public Airplane(String manufacturer, int year, double length, double weight){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = getFuel();
        fillUp(200);
        StringBuilder sb = new StringBuilder();
        sb.append("Самолёт \n");
        sb.append("Изготовитель: " + manufacturer).append(", год выпуска: " + year).append(", длина: " + length).append(" вес: " + weight).
                append(", количество топлива в баке: " + getFuel());
        System.out.println(sb.toString());
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWeight (double weight){
        this.weight = weight;
    }

    public void setFuel (double fuel){
        this.fuel = fuel;
    }

    double getFuel (){
        return this.fuel;
    }

    void info(){
        System.out.println();
        System.out.println("Самолёт");
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + "вес: " + weight + ", количество топлива в баке: " + this.fuel);
    }

    public double fillUp(int n){
        return this.fuel += n;
    }
}

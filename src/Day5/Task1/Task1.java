package Day5.Task1;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("VW");
        car.setColor("Blue");
        car.setYear(2010);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());

        Motorcycle motorcycle = new Motorcycle("Mitsubishi", "Red", 2015);
        System.out.println();
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Color: " + motorcycle.getColor());
        System.out.println("Release Year: " + motorcycle.getYear());

    }

}

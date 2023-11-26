package Day6.Task1And2;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("VW");
        car.setColor("Blue");
        car.setYear(2015);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());
        car.info();
        System.out.println("Age: " + car.yearDifference(2023));

        Motorcycle motorcycle = new Motorcycle("Mitsubishi", "Red", 2015);
        System.out.println();
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Color: " + motorcycle.getColor());
        System.out.println("Release Year: " + motorcycle.getYear());
        motorcycle.info();
        System.out.println("Age: " + motorcycle.yearDifference(2023));

       Airplane airplane = new Airplane("Boeing",2019,30.0, 100.0);
       airplane.setYear(2020);
       airplane.setLength(32.0);
       System.out.println(airplane.fillUp(200));
       System.out.println(airplane.fillUp(300));

       airplane.info();
    }

}

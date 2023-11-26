package Day8.Task2;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2000, 150, 10000);
        airplane.fillUp(200);
        System.out.println(airplane);

        //airplane.info();
    }
}

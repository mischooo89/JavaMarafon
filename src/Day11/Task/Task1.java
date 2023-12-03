package Day11.Task;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);


        businessProcess(picker);
        System.out.println(picker);
        System.out.println(warehouse);


        businessProcess(courier);

        System.out.println(courier);
        System.out.println(warehouse);

        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier(warehouse);
        Picker picker2 = new Picker(warehouse);

        businessProcess(picker2);
        System.out.println(picker2);
        System.out.println(warehouse2);

        businessProcess(courier2);
        System.out.println(courier2);
        System.out.println(warehouse2);
    }


    static void businessProcess(Worker worker){
        for (int i = 1; i<= 10000; i++){
            worker.doWork();

        }
        worker.bonus();
    }
}




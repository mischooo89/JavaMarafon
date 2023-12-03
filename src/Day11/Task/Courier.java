package Day11.Task;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;

    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;

    }

    public int getSalary() {
        return this.salary;
    }

    public boolean getIsPayed() {
        return this.isPayed;
    }

    public String toString() {
        return "Курьер \n " + "Зарплата " + this.salary + " " + " \n Бонус выплачен? " + this.isPayed;
    }

    public void doWork() {
        this.salary += 100;
        warehouse.deliveredOrders();


    }

    @Override
    public void bonus() {
        int bonus = 0;
        if (warehouse.getCountDeliveredOrders() == 10000) {
            bonus += 50000;
            System.out.println("Бонус Курьера: " + bonus);
            isPayed = true;
            return;
        } else if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        } else if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

    }
}

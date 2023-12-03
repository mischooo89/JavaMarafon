package Day11.Task;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;

    private Warehouse warehouse;

    public Picker (Warehouse warehouse){

        this.warehouse = warehouse;

    }

    public int getSalary(){
        return this.salary;
    }

    public boolean getIsPayed(){
        return this.isPayed;
    }

    public String toString(){

        return "Сборщик \n " + "Зарплата " + this.salary + " " + " \n Бонус выплачен? " + this.isPayed ;
    }
    @Override
    public void doWork (){
        this.salary += 80;
        warehouse.pickedOrders();

}

    @Override
    public void bonus() {

        int bonus = 0;
     if(warehouse.getCountPickedOrders() >= 10000){
         bonus += 70000;
         System.out.println("Бонус Сборщика: " + bonus);
         isPayed = true;
         return;
     }else if (warehouse.getCountPickedOrders() < 10000){
         System.out.println("Бонус пока не доступен");
         return;
     }else if (isPayed){
         System.out.println("Бонус уже был выплачен");
         return;
     }


        }

    }


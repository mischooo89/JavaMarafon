package Day11.Task;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;


    public int getCountPickedOrders(){
        return countPickedOrders;
    }

    public int getCountDeliveredOrders(){
        return countDeliveredOrders;
    }

    public String toString(){
        return System.out.printf("Количество собранных заказов %d Количество доставленных заказов %d%n \n" ,
                                  this.countPickedOrders, this.countDeliveredOrders).toString();

    }

    public void pickedOrders(){
        countPickedOrders++;
    }

    public void deliveredOrders(){
        countDeliveredOrders++;
    }
}

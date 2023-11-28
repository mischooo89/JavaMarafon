package Day9.Task2;

public class Rectangle extends Figure{

    double length;
    double width;

    public Rectangle(double length, double width, String color){
        super(color);
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*length + 2*width;
    }
}

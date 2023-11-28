package Day9.Task2;

public class Triangle extends Figure {

    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c, String color){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area(){
        return 0.5 * this.a *this.c;
    }

    public double perimeter(){
        return this.a + this.b + this.c;
    }
}

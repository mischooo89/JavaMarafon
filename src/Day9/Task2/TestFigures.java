package Day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));

    }
    public static double calculateRedPerimeter (Figure[] figures){
        int counter = 0;
        int sum = 0;
        for (int i = 0; i<figures.length; i++){
            if("Red".equals(figures[i].getColor())){
                counter++;
                sum += figures[i].perimeter();
            }
        }
        System.out.println("How many figures are red? " + counter);
        System.out.println("What is the sum of all red perimeters? " + sum);
        return sum;
    }

    public static double calculateRedArea (Figure[]figures){
        int counter = 0;
        int sum = 0;
        for(int i = 0; i<figures.length; i++){
            if("Red".equals(figures[i].getColor())){
                counter++;
                sum += figures[i].area();

            }
        }
        System.out.println("How many figures are red? " + counter);
        System.out.println("What is the sum of all red areas? " + sum);
       return sum;
    }
}


package Day8.Task1;

public class Task1withBuilder {


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<=20000;i++){
            result.append( i).append(" ");

        }System.out.println(result.toString());
        long stopTime = System.currentTimeMillis(); //сохраняем время после того, как код отработал
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
    }


}

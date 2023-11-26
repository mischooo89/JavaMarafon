package Day8.Task1;

public class Task1withStr {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for(int i = 0; i<=20000; i++){
            result += i + " ";

        }System.out.println(result);
        long stopTime = System.currentTimeMillis(); //сохраняем время после того, как код отработал
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));


    }
}

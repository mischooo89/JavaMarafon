package Day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println("Sum of array: "+ arrAddition(numbers,0));
    }

    public static int arrAddition(int[] array, int index){
        if(index<array.length){
          return array[index] + arrAddition(array, index+1);
        }else{
            return 0;
        }
    }
}

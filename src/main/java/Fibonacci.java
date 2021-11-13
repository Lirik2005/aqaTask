import java.util.Arrays;

public class Fibonacci {

    public static void fibonacci(int arrayLength) {
        int[] fibonacciArray = new int[arrayLength];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 2; i < arrayLength; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        System.out.println(Arrays.toString(fibonacciArray));
    }

    public static void main(String[] args) {
        fibonacci(17);
    }

}

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Factorial {

    public static Logger logger = LoggerFactory.getLogger(Factorial.class);


    public static int factorialSimple(int number) {
        int factorial = 1;
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            factorial = factorial * array[i];
        }
        return factorial;
    }

    public static int factorialRecurs(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorialRecurs(number - 1);
        }
    }

    public static void main(String[] args) {

        System.out.printf("Факториал числа %d, рассчитанный без рекурсии, составляет %d \n", 5, factorialSimple(5));

        System.out.printf("Факториал числа %d, рассчитанный с помощью рекурсии, составляет %d \n", 5, factorialRecurs(5));

        logger.info("Factorial");
        trow();


    }

    public static void trow() {
        logger.error("Some Error", new IllegalArgumentException());
        logger.debug("Some Error", new IllegalArgumentException());

    }
}

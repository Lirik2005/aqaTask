import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{1, 2, 3, 4, 5};

        Integer[] newArray = new Integer[array.length];

        for (int i = array.length - 1; i > 0; ) {
            for (int j = 0; j < newArray.length; j++) {
                newArray[j] = array[i];
                i--;
            }
        }

        Collections.reverse(Arrays.asList(array));

        System.out.println(Arrays.toString(newArray));

    }


}

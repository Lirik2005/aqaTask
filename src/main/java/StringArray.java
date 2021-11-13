import java.util.Arrays;

public class StringArray {

    public static void main(String[] args) {

        String str = "Давайте разобьем эту строку на составляющие. ".trim();

        final String[] words = str.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        System.out.println(Arrays.toString(words));


    }
}

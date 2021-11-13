import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamAp {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();


        names.add("Иван");
        names.add("Алексей");
        names.add("Дмитрий");
        names.add("Петр");
        names.add("Сергей");
        names.add("Анна");
        names.add("Виктор");
        names.add("Андрей");
        names.add("Александр");
        names.add("Алина");
        names.add("Федот");

        final List<String> a1 = names.stream().filter(n -> n.startsWith("А")).collect(Collectors.toList());
        final List<String> a2 = names.stream().filter(n -> n.substring(1).startsWith("е")).collect(Collectors.toList());
        System.out.println();
        a1.forEach(System.out::println);
        System.out.println();
        a2.forEach(System.out::println);

      String s = "Ivan";
        System.out.println(s.charAt(0));

        String[] strings = new String[100];
        Arrays.setAll(strings, (index) -> ("hello"));
        Arrays.stream(strings).forEach(System.out::println);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(-3);
        numbers.add(-4);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(-6);

        final List<Integer> collect = numbers.stream().map(n -> n < 0 ? n * -1 : n).collect(Collectors.toList());
        System.out.println(collect);
        final List<Integer> collect2 = numbers.stream().map(Math::abs).collect(Collectors.toList());

        numbers.stream().map(Math::abs).forEach(System.out::println);
        System.out.println(collect2);

        final List<Integer> collect3 = numbers.stream().map(n -> n % 2 == 0 ? n * 100 : n - 100).collect(Collectors.toList());
        System.out.println(collect3);

    }


}

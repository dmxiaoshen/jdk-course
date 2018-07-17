import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","b");
        List<String> b = new ArrayList<>();
        list.addAll(b);
        list.forEach(System.out::println);
        System.out.println("Hello World!");
    }
}

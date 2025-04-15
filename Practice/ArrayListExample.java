import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        list.add(2, 99); // insert 99 at index 2
        list.remove(1);  // remove element at index 1
        System.out.println(list); // [1, 99, 3, 4]
    }
}

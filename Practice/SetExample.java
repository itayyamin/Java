import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // duplicate, will not be added

        System.out.println("Set contents: " + names);
        names.remove("Bob");
        System.out.println("After removal: " + names);
        System.out.println("Contains Alice? " + names.contains("Alice"));
    }
}

// Animal interface with abstract and default methods
public interface Animal {

    // Abstract method (must be implemented by any class that implements Animal)
    void birth();

    // Default method (can be used by classes implementing Animal)
    default void breath() {
        System.out.println("I breathe air");
    }
}
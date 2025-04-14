public class Inheritance {
    
    public static void main(String[] args) {
        // Create objects of Dog and Snake to demonstrate functionality
        Dog myDog = new Dog();
        Snake mySnake = new Snake();

        // Calling Dog methods
        System.out.println("Dog:");
        myDog.birth();  // Calling the overridden method
        myDog.breath(); // Calling the overridden method

        System.out.println("\nSnake:");
        mySnake.birth();  // Calling the overridden method
        mySnake.breath(); // Calling the overridden method
    }
}

// Mammal class implements Animal (demonstrating inheritance and implementation)
public class Mammal implements Animal {

    // Implementing the abstract birth method from Animal interface
    @Override
    public void birth() {
        System.out.println("A mammal gives birth to live young.");
    }

    // Optionally, we can override the breath method
    @Override
    public void breath() {
        System.out.println("I breathe air through lungs.");
    }
}
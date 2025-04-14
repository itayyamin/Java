// Reptile class implements Animal (for demonstration of multiple interfaces)
public class Reptile implements Animal {

    public Reptile(){
        System.out.println("This is Reptile constuctor");
    }

    // Implementing the abstract birth method from Animal interface
    @Override
    public void birth() {
        System.out.println("A reptile lays eggs.");
    }

    // We can still use the default breath method from the Animal interface
    // @Override
    // public void breath() {
    //     System.out.println("I breathe air through lungs.");
    // }
}
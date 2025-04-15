// Reptile class implements Animal (for demonstration of multiple interfaces)
public class Reptile extends Animal {

    public Reptile(){
        System.out.println("This is Reptile constuctor");
    }

    // Implementing the abstract birth method from Animal interface
    @Override
    public void birth() {
        System.out.println("A reptile lays eggs.");
    }

}
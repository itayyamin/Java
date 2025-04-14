// Dog class extends Mammal and implements Animal (demonstrates both inheritance and interface implementation)
public class Dog extends Mammal {

    public Dog(){
        System.out.println("This is Dog constuctor");
    }

    @Override
    public void birth() {
        System.out.println("A dog gives birth to puppies.");
    }

    // You can still call the inherited breath() method, or override it if needed.
    @Override
    public void breath() {
        super.breath();  // Calling the inherited breath method
        System.out.println("A dog breathes through its nose.");
    }
}
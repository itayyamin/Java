public class Whale extends Mammal implements SeaAnimal{
    // Whale class extends Mammal and implements SeaCreature and Animal interfaces

    public Whale() {
        System.out.println("This is Whale constructor");
    }

    // Implementing the abstract birth method from Animal interface
    @Override
    public void birth() {
        System.out.println("A whale gives birth to a calf.");
    }

    // Implementing the swim method from SeaCreature interface
    @Override
    public void swim() {
        System.out.println("A whale swims gracefully in the ocean.");
    }

    // Optionally, we can override the breath method
    @Override
    public void breath() {
        super.breath();  // Calling the inherited breath method
        System.out.println("A whale breathes through its blowhole.");
    }
}

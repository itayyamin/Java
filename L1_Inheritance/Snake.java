// Snake class extends Reptile and implements Animal (also demonstrates both inheritance and interface implementation)
public class Snake extends Reptile {

    public Snake(){
        System.out.println("This is Snake constuctor");
    }

    @Override
    public void birth() {
        System.out.println("A snake lays eggs.");
    }

    // Snake can also use the default breath method, but we can override it if needed.
    @Override
    public void breath() {
        super.breath();  // Calling the inherited breath method
        System.out.println("A snake breathes air through its nostrils.");
    }
}
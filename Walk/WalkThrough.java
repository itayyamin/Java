class A {
    private void sayHello() {
        System.out.println("Hello from A");
    }

    public void callSayHello() {
        sayHello();
    }
}

class B extends A {
    // זו לא override – זו מתודה חדשה לגמרי!
    public void sayHello() {
        System.out.println("Hello from B");
    }
}



public class WalkThrough {

    public static void main(String[] args) {


        B b = new B();

        // זה יקרא ל-B.sayHello() – כי קראנו לה ישירות
        b.sayHello(); // Output: Hello from B

        // זה יקרא ל-A.sayHello() – למרות שזה אובייקט מסוג B,
        // המתודה ב-A היא private ולכן היא לא עברה override
        b.callSayHello(); // Output: Hello from A
    }
}

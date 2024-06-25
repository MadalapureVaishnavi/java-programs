// Singleton class
public class Singleton {

    // private static variable of the same class that is the only instance of the class
    private static Singleton singleInstance = null;

    // variable of type String
    public String s;

    // private constructor restricted to this class itself
    private Singleton() {
        s = "Hello, I am a part of Singleton class";
    }

    // static method to create instance of Singleton class
    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}

// Driver Class
public class PAttern10 {
    public static void main(String[] args) {
        // instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();

        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        // changing variable of instance x
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        // changing variable of instance z
        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}

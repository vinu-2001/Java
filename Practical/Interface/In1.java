package corejava;

// Java program to demonstrate working of
// interface



// A simple interface
public interface In1 {
    
    // public, static and final
    final int a = 100000;

    // public and abstract
    void display();
}

// A class that implements the interface.
class TestClass implements In1 {
    
    // Implementing the capabilities of
    // interface.
    public void display(){
    System.out.println("Prabhu");
    }

    // main method
    public static void main(String[] args)
    {
        TestClass t = new TestClass();// Creating object of test class
        t.display();//calling display method using object
        System.out.println(a);
    }
}








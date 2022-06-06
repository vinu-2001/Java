// Java program for showing use of Call by reference in this example 
package corejava;

public class CallByRefEx { 
    /*
     *  The original value of 'a' will be changed as we are trying
     *  to pass the objects. Objects are passed by reference.
     */
    int a = 10;
    void call(CallByRefEx c) {
        c.a = c.a+10;
    }
    public static void main(String[] args) {

    	CallByRefEx c = new CallByRefEx();
        System.out.println("Before call-by-reference: " + c.a);
        
        // passing the object as a value using pass-by-reference
        c.call(c);
        System.out.println("After call-by-reference: " + c.a);
        
        
    }
}


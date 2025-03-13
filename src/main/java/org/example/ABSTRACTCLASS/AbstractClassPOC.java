package org.example.ABSTRACTCLASS;
public abstract class AbstractClassPOC {

     int roll_Number; // Instance Variable In abstract class

     public  AbstractClassPOC(int  roll_Number) // Constructor In Abstract Class
     {
         this.roll_Number=roll_Number; //   this keyword in Java is a reference to the current object of the class.
                                        // It is used to access instance variables, methods, and constructors within the same class.
     }


    abstract void add(); //Abstract Method  with void return type

    abstract int sub(); // Abstract Method With Int Return Type

    public void display() {
        System.out.println("This is concrete method");
    }

    public static void StaticMethod(){

        System.out.println("This Message is Coming from static Method from Abstract Class");

    }



}


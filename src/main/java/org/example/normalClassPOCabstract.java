package org.example;

public class normalClassPOCabstract extends AbstractClassPOC {

    int a=10, b=5;
    int result;


    public normalClassPOCabstract() // Instating The Constructor in Subclass class
    {
        super(100);   // Super Keyword use to Call Base Class Constructor.
    }

    @Override
    void add() {

        result = a+b;
        System.out.println("This is add method"+" "+" "+"Result is"+" "+result);
    }

    @Override
    int sub() {
        result = a-b;

      System.out.println(result);
        return result;

    }

    public static void main(String [] args)
    {
        AbstractClassPOC.StaticMethod();  // Calling The Static method
        normalClassPOCabstract nc = new normalClassPOCabstract(); // Creating Object of the class
        nc.add(); // Calling Subclassed Method
        nc.sub(); // Calling Subclassed Method
        nc.display(); // Calling Concrete method.
    }
}

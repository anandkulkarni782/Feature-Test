package org.example;

public class normalClass extends AbstractClassPOC {

    int a=10, b=5;
    int result;
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
        AbstractClassPOC.StaticMethod();
        normalClass nc = new normalClass();
        nc.add();
        nc.sub();
        nc.display();
    }
}

package singletonDesign;

public class Calculator
{
    private Calculator()
    {
        System.out.println("Calculator Activated");
    }

    static Calculator obj = new Calculator();

    public static Calculator getObject()
    {
        return obj;
    }

    public void add(int a , int b)
    {
        int x = a + b;
        System.out.println("Addition : " + x );
    }

    public void subtract(int a , int b)
    {
        int x = a - b;
        System.out.println("Subtraction : " + x);
    }
}

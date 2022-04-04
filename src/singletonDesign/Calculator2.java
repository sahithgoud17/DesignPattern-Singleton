package singletonDesign;

public class Calculator2
{
    static Calculator2 obj;

    private Calculator2()
    {
        System.out.println("Calculator2 Activated");
    }

    public static synchronized Calculator2 getObject()
    {
        if (obj == null) {
            obj = new Calculator2();
        }
        return obj;
    }

    public void add(int a, int b) {
        int x = a + b;
        System.out.println("Addition : " + x);
    }

    public void subtract(int a, int b) {
        int x = a - b;
        System.out.println("Subtraction : " + x);
    }
}

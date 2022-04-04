package singletonDesign;

public class Main
{
    public static void main(String[] args)
    {
        Calculator object1 = Calculator.getObject();

        object1.add(2,3);

        Calculator object2 = Calculator.getObject();

        object2.subtract(3,4);
    }
}

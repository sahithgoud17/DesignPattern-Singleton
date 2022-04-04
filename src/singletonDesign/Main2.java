package singletonDesign;

public class Main2
{
    public static void main(String[] args)
    {
        Calculator2 object1 = Calculator2.getObject();
        object1.add(2,3);

        Calculator2 object2 = Calculator2.getObject();
        object2.subtract(3,4);
    }
}

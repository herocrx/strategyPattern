package Quack;

public class NoQuack implements  IQuackBehavior {
    public void NoQuack()
    {
        System.out.format("No quack has been adapted");
    }

    public void quack()
    {
        System.out.println("No quack - has been performed");
    }


}

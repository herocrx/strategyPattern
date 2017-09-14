package Quack;

public class SimpleQuack implements IQuackBehavior {
    public SimpleQuack()
    {
        System.out.format("Family quack has been adapted");
    }

    @Override
    public void quack() {
        System.out.println("Quack!!!!! = Simple");
    }
}

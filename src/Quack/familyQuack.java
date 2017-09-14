package Quack;

public class familyQuack implements IQuackBehavior {
    public familyQuack()
    {
        System.out.format("Family quack has been adapted \n");
    }

    public void quack()
    {
        System.out.format("quack! Quack! QUack ! QUAck ! QUACk ! QUACK \n");
    }
}

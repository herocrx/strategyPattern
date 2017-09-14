package fly;

public class simpleFly implements IFlyBehavior{
    public simpleFly()
    {
        System.out.println("Turtle constructor has been executed");
    }

    public void fly()
    {
        System.out.println("Simple fly method has been executed");
    }
}

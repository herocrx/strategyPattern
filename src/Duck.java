import Display.IDispalyBehavior;
import Quack.IQuackBehavior;
import fly.IFlyBehavior;

public class Duck
{
    IFlyBehavior flyStrategy;
    IQuackBehavior quackStrategy;
    IDispalyBehavior displayStrategy;

        public Duck(IFlyBehavior flyStrategy, IQuackBehavior quackStrategy, IDispalyBehavior displayStrategy)
        {
            System.out.println("\nDuck constructor is executing");
            this.flyStrategy = flyStrategy;
            this.quackStrategy = quackStrategy;
            this.displayStrategy = displayStrategy;
        }


        public void fly()
        {
            System.out.println("\nRunning fly method in a duck ");
            flyStrategy.fly();
        }

        public void quack()
        {
            System.out.println("\nRunning quack method in a duck ");
            quackStrategy.quack();
        }


        public void display()
        {
            System.out.println("\nRunning display method in a duck ");
            displayStrategy.display();
        }


        public void showProperties()
        {
            fly();
            quack();
            display();
        }


}

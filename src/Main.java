import Display.IDispalyBehavior;
import Display.CityDuck;
import Quack.IQuackBehavior;
import Quack.familyQuack;
import fly.IFlyBehavior;
import fly.turtleFly;

public class Main {

    public static void main(String[] args) {
        System.out.println("Duck example of stategy pattern! \n");

        IFlyBehavior flyBehavior = new turtleFly();
        IQuackBehavior quackBehavior = new familyQuack();
        IDispalyBehavior displayBehavior = new CityDuck();


        Duck duck1 = new Duck(flyBehavior,quackBehavior,displayBehavior);
        duck1.showProperties();


    }
}

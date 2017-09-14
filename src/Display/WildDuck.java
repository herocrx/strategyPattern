package Display;

public class WildDuck implements IDispalyBehavior {
    @Override
    public void display() {
        System.out.println("Wild duck display method has been executed");
    }

    public WildDuck(){
        System.out.println("Wild duck display constructor has been executed");
    }
}

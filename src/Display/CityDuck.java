package Display;


public class CityDuck implements IDispalyBehavior {


    public CityDuck(){
        System.out.println("City duck constructor display has been executed");
    }

    @Override
    public void display() {
        System.out.println("City duck display method has been executed");
    }


}

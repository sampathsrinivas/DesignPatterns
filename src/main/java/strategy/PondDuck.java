package strategy;

public class PondDuck extends Duck {

    public PondDuck() {
      flyBehaviour = new FlyWithWings();
      quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Looks like a Pond duck!!");
    }
}

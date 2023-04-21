package strategy;

public class Client {

    public static void main(String[] args) {
        Duck duck = new PondDuck();
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
        duck.setFlyStrategy(new FlyNoWay());
        duck.performFly();
        duck.setQuackStrategy(new Squeak());
        duck.performQuack();
    }
}

package strategy;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {

    }

    public void swim() {
        System.out.println("The Duck is swimming");
    }

    public void display() {

    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyStrategy(FlyBehaviour fb){
        flyBehaviour = fb;
    }

    public void setQuackStrategy(QuackBehaviour qc){
        quackBehaviour = qc;
    }

}

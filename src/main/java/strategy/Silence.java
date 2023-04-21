package strategy;

public class Silence implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("No Sound!!");
    }
}

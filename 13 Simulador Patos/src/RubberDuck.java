public class RubberDuck extends Duck {

    public RubberDuck() {
        qb = new Squeak();
        fb = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}

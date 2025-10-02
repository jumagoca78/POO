public class BallonDuck extends Duck{

    public BallonDuck() {
        qb = new Quack();
        fb = new FlyWithBallon();
    }

    @Override
    public void display() {
        System.out.println("I'm a Ballon Duck");
    }
}

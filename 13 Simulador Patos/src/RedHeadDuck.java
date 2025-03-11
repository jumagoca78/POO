public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        qb = new Quack();
        fb = new FlyWithWings();
    }
    
    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
    
}

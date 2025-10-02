public class Decoy extends Duck{

    public Decoy() {
        qb = new MuteQuack();
        fb = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Decoy Duck");
    }
}

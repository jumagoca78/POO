public class Mallard extends Duck{

    public Mallard(){
        fb = new FlyWithWings();
        qb = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
      }
    

}

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        flyBehavior = new FlywithWings();
        quackBehavior = new FunnyQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck");
    }
    
   
   
}

public class MallardDuck extends  Duck{

    public MallardDuck() {
        flyBehavior = new FlywithWings();
        quackBehavior = new FunnyQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
}

    

}

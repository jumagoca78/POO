public class App {
    public static void main(String[] args) throws Exception {
        Duck mallard = new MallardDuck();
        mallard.showDuck();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new MuteQuack());
        mallard.showDuck();
    }
}

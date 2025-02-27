public class App {
    public static void main(String[] args) {
        Duck duck1 = new Mallard();
        duck1.showDuck();

        System.out.println("--------------------");

        Duck duck2 = new BallonDuck();
        duck2.showDuck();

        System.out.println("--------------------");

        Duck duck3 = new Decoy();
        duck3.showDuck();

        System.out.println("--------------------");

        Duck duck4 = new RedHeadDuck();
        duck4.showDuck();

        System.out.println("--------------------");

        Duck duck5 = new RubberDuck();
        duck5.showDuck();

    }
}

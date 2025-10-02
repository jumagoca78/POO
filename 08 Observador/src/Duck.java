public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swimm (){
        System.out.println("I am swimming");
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void showDuck(){
        display();
        performFly();
        performQuack();
        swimm();
    }
    
}

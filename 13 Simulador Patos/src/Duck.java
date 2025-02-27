public abstract class Duck {

    QuackBehavior qb;
    FlyBehavior fb;


    public abstract void display();

    public void setQuackBehavior(QuackBehavior q){
        qb = q;
    }

    public void setFlyBehavior(FlyBehavior f){
        fb = f;
    }
    
    public void performQuack(){
        qb.quack();
    }

    public void performFly(){
        fb.fly();
    }

    public void swim(){
        System.out.println("I'm swimming");
    }

    public void showDuck ()
    {
        display();
        performQuack();
        performFly();
        swim();
    }
}


public abstract class Subject {

    //metodos abstractos
    public abstract void registerObserver(Observer o);
    public abstract void removeObserver(Observer o);
    public abstract void notifyObservers();

    
}

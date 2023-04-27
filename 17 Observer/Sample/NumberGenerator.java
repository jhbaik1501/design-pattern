import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    // Observer를 저장한다  
    private List<Observer> observers = new ArrayList<>();

    // Observer를 추가한다 
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Observer를 제거한다 
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    // Observer에 통지한다 
    public void notifyObservers() {
        for (Observer o: observers) {
            o.update(this);
        }
    }

    // 수를 취득한다 
    public abstract int getNumber();

    // 수를 생성한다 
    public abstract void execute();
}

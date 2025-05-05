import java.util.*;

interface Observer {
    void update(String data);
}

class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public void update(String data) {
        System.out.println(name + " recebeu: " + data);
    }
}

class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String data;

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void setData(String data) {
        this.data = data;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(data);
        }
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer obs1 = new ConcreteObserver("Observer1");
        Observer obs2 = new ConcreteObserver("Observer2");

        subject.attach(obs1);
        subject.attach(obs2);

        subject.setData("Nova atualização");
    }
}
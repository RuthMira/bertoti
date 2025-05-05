class ConcreteObserver {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public void update(String data) {
        System.out.println(name + " recebeu: " + data);
    }
}

public class ObserverAntiPattern {
    public static void main(String[] args) {
        ConcreteObserver obs1 = new ConcreteObserver("Observer1");
        ConcreteObserver obs2 = new ConcreteObserver("Observer2");

        obs1.update("Notificação direta");
        obs2.update("Notificação direta");
    }
}
import java.util.*;

class Leaf {
    public void doSomething() {
        System.out.println("Folha executando ação");
    }
}

class Composite {
    private List<Leaf> folhas = new ArrayList<>();

    public void add(Leaf f) {
        folhas.add(f);
    }

    public void executarTudo() {
        for (Leaf f : folhas) {
            f.doSomething();
        }
    }
}

public class CompositeAntiPattern {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);
        composite.executarTudo();
    }
}
import java.util.*;

interface Component {
    void operation();
}

class Leaf implements Component {
    public void operation() {
        System.out.println("Operação na folha");
    }
}

class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void operation() {
        for (Component c : children) {
            c.operation();
        }
    }
}

public class CompositePattern {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();

        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);

        composite.operation();
    }
}
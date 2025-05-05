package PPS_padroesprojetos.Stategy;
interface Strategy {
    void execute();
}

class StrategyA implements Strategy {
    public void execute() {
        System.out.println("Executando estratégia A");
    }
}

class StrategyB implements Strategy {
    public void execute() {
        System.out.println("Executando estratégia B");
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        Strategy strategy = new StrategyA();
        strategy.execute();

        strategy = new StrategyB();
        strategy.execute();
    }
}
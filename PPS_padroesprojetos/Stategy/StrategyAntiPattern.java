package PPS_padroesprojetos.Stategy;
public class StrategyAntiPattern {
    public static void main(String[] args) {
        executar("A");
        executar("B");
        executar("C");
    }

    public static void executar(String tipo) {
        if (tipo.equals("A")) {
            System.out.println("Executando estratégia A");
        } else if (tipo.equals("B")) {
            System.out.println("Executando estratégia B");
        } else {
            System.out.println("Tipo inválido");
        }
    }
}
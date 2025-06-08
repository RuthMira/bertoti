package PPS_padroesprojetos.Estrutura.Stategy;

class Veiculo {
    public void abastecer() {
        System.out.println("Abastecendo veículo...");
    }
}

class Carro extends Veiculo {
    public void mover() {
        System.out.println("Andando com 4 rodas");
    }
}

class Moto extends Veiculo {
    public void mover() {
        System.out.println("Andando com 2 rodas");
    }
}

class Aviao extends Veiculo {
    public void mover() {
        System.out.println("Voando pelos céus");
    }
}

public class StrategyAntiPattern {
    public static void main(String[] args) {
        Veiculo v1 = new Carro();
        Veiculo v2 = new Moto();
        Veiculo v3 = new Aviao();

        v1.abastecer(); v2.abastecer(); v3.abastecer();

        ((Carro)v1).mover();
        ((Moto)v2).mover();
        ((Aviao)v3).mover();
    }
}
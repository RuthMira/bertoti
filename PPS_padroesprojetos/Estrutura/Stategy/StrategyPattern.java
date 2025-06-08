package PPS_padroesprojetos.Estrutura.Stategy;

interface ModoDeMover {
    void mover();
}

class Dirigir implements ModoDeMover {
    public void mover() {
        System.out.println("Dirigindo pelas ruas");
    }
}

class Pilotar implements ModoDeMover {
    public void mover() {
        System.out.println("Voando com o avião");
    }
}

class Pedalar implements ModoDeMover {
    public void mover() {
        System.out.println("Pedalando a bicicleta");
    }
}

class Veiculo {
    private ModoDeMover modo;

    public void setModoDeMover(ModoDeMover modo) {
        this.modo = modo;
    }

    public void locomover() {
        modo.mover();
    }

    public void abastecer() {
        System.out.println("Abastecendo veículo...");
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        Veiculo v = new Veiculo();

        v.abastecer();

        v.setModoDeMover(new Dirigir());
        v.locomover();

        v.setModoDeMover(new Pilotar());
        v.locomover();

        v.setModoDeMover(new Pedalar());
        v.locomover();
    }
}
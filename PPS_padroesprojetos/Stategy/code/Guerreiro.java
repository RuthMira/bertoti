// Classe que usa uma estratégia de ataque
public class Guerreiro {
    private EstrategiaAtaque estrategiaAtaque;

    public Guerreiro(EstrategiaAtaque estrategiaAtaque) {
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public void setEstrategiaAtaque(EstrategiaAtaque estrategiaAtaque) {
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public void atacar() {
        estrategiaAtaque.atacar();
    }
}


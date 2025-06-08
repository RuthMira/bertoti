package PPS_padroesprojetos.Estrutura.Composite;
import java.util.ArrayList;
import java.util.List;

// Interface base do padrão Composite
interface Component {
    void imprimir(); // operação polimórfica
}

// Classe folha (Leaf)
class Leaf implements Component {
    private String nome;

    public Leaf(String nome) {
        this.nome = nome;
    }

    @Override
    public void imprimir() {
        System.out.println("Folha: " + nome);
    }
}

// Classe composta (Composite)
class Composite implements Component {
    private String nome;
    private List<Component> componentes = new ArrayList<>();

    public Composite(String nome) {
        this.nome = nome;
    }

    public void add(Component componente) {
        componentes.add(componente);
    }

    @Override
    public void imprimir() {
        System.out.println("Composto: " + nome);
        for (Component componente : componentes) {
            componente.imprimir(); // chamada polimórfica
        }
    }
}

// Classe principal com nome baseado no padrão
public class CompositePattern {
    public static void main(String[] args) {
        Component folha1 = new Leaf("Botão");
        Component folha2 = new Leaf("Texto");

        Composite painel = new Composite("Painel");
        painel.add(folha1);
        painel.add(folha2);

        Composite janela = new Composite("Janela");
        janela.add(painel);
        janela.add(new Leaf("Rodapé"));

        janela.imprimir();
    }
}

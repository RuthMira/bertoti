import java.util.ArrayList;
import java.util.List;

class TarefaComposta implements Tarefa {
    private String nome;
    private String descricao;
    private List<Tarefa> tarefas = new ArrayList<>();

    public TarefaComposta(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public boolean isConcluida() {
        return tarefas.stream().allMatch(Tarefa::isConcluida);
    }

    @Override
    public void print() {
        System.out.println("\n📂 " + nome + ": " + descricao);
        for (Tarefa tarefa : tarefas) {
            tarefa.print();
        }
    }
}
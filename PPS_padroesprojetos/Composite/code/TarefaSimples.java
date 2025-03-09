// Classe que representa uma tarefa simples
class TarefaSimples implements Tarefa {
    private String nome;
    private String descricao;
    private boolean concluida;

    public TarefaSimples(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluir() {
        this.concluida = true;
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
        return concluida;
    }

    @Override
    public void print() {
        String status = concluida ? "✅" : "❌";
        System.out.println(status + " " + nome + ": " + descricao);
    }
}

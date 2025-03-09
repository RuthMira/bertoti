
public class GerenciadorTarefas {
    public static void main(String[] args) {
        Tarefa tarefa1 = new TarefaSimples("Comprar leite", "Ir ao mercado e comprar leite");
        Tarefa tarefa2 = new TarefaSimples("Enviar e-mail", "Responder e-mail do cliente");

        TarefaComposta projeto = new TarefaComposta("Projeto X", "Concluir desenvolvimento do sistema");
        projeto.adicionarTarefa(tarefa1);
        projeto.adicionarTarefa(tarefa2);

        TarefaComposta sprint = new TarefaComposta("Sprint 1", "Primeira sprint do projeto");
        sprint.adicionarTarefa(new TarefaSimples("Criar banco de dados", "Definir estrutura do banco"));
        sprint.adicionarTarefa(new TarefaSimples("Desenvolver API", "Criar endpoints REST"));

        projeto.adicionarTarefa(sprint);

        projeto.print();
    }
}

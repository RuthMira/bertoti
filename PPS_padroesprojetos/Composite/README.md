-----------------------------------
|       <<interface>> Tarefa       |
-----------------------------------
| + getNome()                      |
| + getDescricao()                 |
| + isConcluida()                  |
| + print()                        |
-----------------------------------
           ▲
           |
---------------------------
|        TarefaSimples       |
---------------------------
| - nome: String            |
| - descricao: String       |
| - concluida: boolean      |
---------------------------
| + getNome()               |
| + getDescricao()          |
| + isConcluida()           |
| + print()                 |
---------------------------

---------------------------
|        TarefaComposta      |
---------------------------
| - nome: String            |
| - descricao: String       |
| - tarefas: List<Tarefa>   |
---------------------------
| + adicionarTarefa(Tarefa)  |
| + getNome()               |
| + getDescricao()          |
| + isConcluida()           |
| + print()                 |
---------------------------

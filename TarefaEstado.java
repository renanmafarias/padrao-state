package state;

public abstract class TarefaEstado {
    
    public abstract String getEstado();

    public boolean iniciar(Tarefa tarefa) {
        return false;
    }

    public boolean parar(Tarefa tarefa) {
        return false;
    }

    public boolean concluir(Tarefa tarefa) {
        return false;
    }    
}

package state;

public class TarefaEstadoEmAndamento extends TarefaEstado {

    private TarefaEstadoEmAndamento() {};
    private static TarefaEstadoEmAndamento instance = new TarefaEstadoEmAndamento();
    public static TarefaEstadoEmAndamento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em andamento";
    }
    
    public boolean parar(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoParada.getInstance());
        return true;
    }
    
    public boolean concluir(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoConcluida.getInstance());
        return true;
    }
}

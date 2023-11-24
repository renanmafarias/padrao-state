package state;

public class TarefaEstadoAIniciar extends TarefaEstado {

    private TarefaEstadoAIniciar() {};
    private static TarefaEstadoAIniciar instance = new TarefaEstadoAIniciar();
    public static TarefaEstadoAIniciar getInstance() {
        return instance;
    }

    public String getEstado() {
        return "A iniciar";
    }
    
    public boolean iniciar(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoEmAndamento.getInstance());
        return true;
    }
}

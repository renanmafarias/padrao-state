package state;

public class TarefaEstadoParada extends TarefaEstado {

    private TarefaEstadoParada() {};
    private static TarefaEstadoParada instance = new TarefaEstadoParada();
    public static TarefaEstadoParada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Parada";
    }
    
    public boolean iniciar(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoEmAndamento.getInstance());
        return true;
    }
}

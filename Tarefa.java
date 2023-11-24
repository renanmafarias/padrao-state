package state;

public class Tarefa {
    
    private String nome;
    private String descricao;
    private TarefaEstado estado;

    public Tarefa() {
        this.estado = TarefaEstadoAIniciar.getInstance();
    }
    
    public void setEstado(TarefaEstado estado) {
        this.estado = estado;
    }
    
    public boolean iniciar() {
        return estado.iniciar(this);
    }
    
    public boolean parar() {
        return estado.parar(this);
    }
    
    public boolean concluir() {
        return estado.concluir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TarefaEstado getEstado() {
        return estado;
    }    
}

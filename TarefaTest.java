package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TarefaTest {

    Tarefa tarefa;

    @BeforeEach
    public void setUp() {
        tarefa = new Tarefa();
    }

    // Tarefa a iniciar

    @Test
    public void deveIniciarTarefaAIniciar() {
        tarefa.setEstado(TarefaEstadoAIniciar.getInstance());
        assertTrue(tarefa.iniciar());
        assertEquals(TarefaEstadoEmAndamento.getInstance(), aluno.getEstado());
    }

    @Test
    public void naoDevePararTarefaAIniciar() {
        tarefa.setEstado(TarefaEstadoAIniciar.getInstance());
        assertFalse(tarefa.parar());
    }

    @Test
    public void naoDeveConcluirTarefaAIniciar() {
        tarefa.setEstado(TarefaEstadoAIniciar.getInstance());
        assertFalse(tarefa.concluir());
    }

    // Tarefa em andamento

    @Test
    public void naoDeveIniciarTarefaEmAndamento() {
        tarefa.setEstado(TarefaEstadoEmAndamento.getInstance());
        assertFalse(tarefa.iniciar());
    }
    
    @Test
    public void devePararTarefaEmAndamento() {
        tarefa.setEstado(TarefaEstadoEmAndamento.getInstance());
        assertTrue(tarefa.parar());
        assertEquals(TarefaEstadoParada.getInstance(), tarefa.getEstado());
    }

    @Test
    public void deveConcluirTarefaEmAndamento() {
        tarefa.setEstado(TarefaEstadoEmAndamento.getInstance());
        assertTrue(tarefa.concluir());
        assertEquals(TarefaEstadoConcluida.getInstance(), tarefa.getEstado());
    }

    // Tarefa parada

    @Test
    public void deveIniciarTarefaParada() {
        tarefa.setEstado(TarefaEstadoParada.getInstance());
        assertTrue(tarefa.iniciar());
        assertEquals(TarefaEstadoEmAndamento.getInstance(), tarefa.getEstado());
    }

    @Test
    public void naoDevePararTarefaParada() {
        tarefa.setEstado(TarefaEstadoParada.getInstance());
        assertFalse(tarefa.parar());
    }

    @Test
    public void naoDeveConcluirTarefaParada() {
        tarefa.setEstado(TarefaEstadoParada.getInstance());
        assertFalse(tarefa.concluir());
    }

    // Tarefa concluída

    @Test
    public void naoDeveIniciarTarefaConcluida() {
        tarefa.setEstado(TarefaEstadoConcluida.getInstance());
        assertFalse(tarefa.iniciar());
    }

    @Test
    public void naoDevePararTarefaConcluida() {
        tarefa.setEstado(TarefaEstadoConcluida.getInstance());
        assertFalse(tarefa.parar());
    }

    @Test
    public void naoDeveConcluirTarefaConcluida() {
        tarefa.setEstado(TarefaEstadoConcluida.getInstance());
        assertFalse(tarefa.concluir());
    }
}
import java.util.ArrayList;
public class Tarefas implements Tarefa {
    private boolean feita;
    private String descricao;

    public Tarefas(String descricao) {
        this.descricao = descricao;
        this.feita = false;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public boolean getFeita() {
        return this.feita;
    }

    public void setFeita(boolean feita) {
        this.feita = feita;
    }

}

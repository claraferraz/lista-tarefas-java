import java.util.ArrayList;
//Adicionar tarefa, remover tarefa, marcar tarefa como concluída, listar tarefas.
//Utilizar ArrayList para armazenar as tarefas.

public class ListaTarefas {
    private ArrayList<Tarefas> lista;

    public ListaTarefas() {
        this.lista = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefas t) {
        this.lista.add(t);
        listarTarefas();
    }

    public void removerTarefa(int index) {
        this.lista.remove(index);
        listarTarefas();
    }

    public void marcarConcluida(int index) {
        lista.get(index).setFeita(true);
        listarTarefas();
    }

    public void listarTarefas() {
        System.out.println("------------------");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getFeita()) {
                System.out.println(i  + " x" + " " + lista.get(i).getDescricao());
            } else {
                System.out.println(i + " o" + " " + lista.get(i).getDescricao());
            }
        }
        System.out.println("------------------");
    }
}

import java.util.Scanner;

public class Main {
    //Adicionar tarefa, remover tarefa, marcar tarefa como concluída, listar tarefas.
    //Utilizar ArrayList para armazenar as tarefas.
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        boolean repetir = true;
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        while (repetir) {
            System.out.println("Lista de Tarefas");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Marcar tarefa como feita");
            System.out.println("4. Listar tarefas");
            System.out.println("5. Sair");
            int opcao = num.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Descrição da tarefa:");
                    String descricao = sc.nextLine();
                    Tarefas t = new Tarefas(descricao);
                    lista.adicionarTarefa(t);
                    break;
                case 2:
                    lista.listarTarefas();
                    System.out.println("Selecione o índice da tarefa:");
                    int i = num.nextInt();
                    lista.removerTarefa(i);
                    break;
                case 3:
                    lista.listarTarefas();
                    System.out.println("Selecione o índice da tarefa:");
                    int j = num.nextInt();
                    lista.marcarConcluida(j);
                    break;
                case 4:
                    lista.listarTarefas();
                    break;
                case 5:
                    repetir = false;
                    break;
            }
        }
    }
}
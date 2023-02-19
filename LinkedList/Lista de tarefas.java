import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        LinkedList<String> fazer = new LinkedList<>();
        System.out.println("Lista de tarefas");
        int escolha;
        do{
            menu();
            escolha = in.nextInt();
            switch (escolha){
                case 1:
                    adicionarInicio(fazer);
                    break;
                case 2:
                    adicionarFinal(fazer);
                    break;
                case 3:
                    removerInicio(fazer);
                    break;
                case 4:
                    removerFinal(fazer);
                    break;

                case 5:
                    percorrerTipo2(fazer);
                    break;

                case 6:
                    alterar(fazer);
                    break;

                case 0:
                    System.out.println("Fim do programa! @Developer Valmir Junior.");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente!");
                    break;
            }
        }while(escolha!=0);
    }

    public static void adicionarInicio(LinkedList<String> trabalho){//adicionar no inicio
        Scanner in = new Scanner(System.in);
        String nome;
        System.out.print("Digite o nome da tarefa: ");
        nome = in.nextLine();
        trabalho.addFirst(nome);
        System.out.println("Inserção efetuada!");
    }

    public static void adicionarFinal(LinkedList<String> trabalho){//adicionar no final
        Scanner in = new Scanner(System.in);
        String nome;
        System.out.print("Digite o nome da tarefa: ");
        nome = in.nextLine();
        trabalho.addLast(nome);
        System.out.println("Inserção efetuada!");
    }

    public static void percorrerTipo2(LinkedList<String> trabalho){ //Outra maneira de percorrer um ArrayList
        if(trabalho.size() == 0){
            System.out.println("Está vázio! Você não pode consultar.");
        }else{
            for (String i : trabalho) {
                System.out.println(i);
            }
        }
    }

    public static void removerInicio(LinkedList<String> trabalho){
        if(trabalho.size() == 0){
            System.out.println("Está vázio! Você não pode remover.");
        }else {
            trabalho.removeFirst();
            System.out.println("Remoção efetuada!");
        }
    }

    public static void removerFinal(LinkedList<String> trabalho){
        if(trabalho.size() == 0){
            System.out.println("Está vázio! Você não pode remover.");
        }else {
            trabalho.removeLast();
            System.out.println("Remoção efetuada!");
        }
    }

    public static void menu(){
        System.out.println("");
        System.out.println("Menu de opções");
        System.out.println("");
        System.out.println("1- Adicionar na inicio da lista");
        System.out.println("2- Adicionar no final da lista");
        System.out.println("3- Remover no inicio da lista");
        System.out.println("4- Remover no final da lista");
        System.out.println("5- Consultar lista");
        System.out.println("6- Alterar na lista");
        System.out.println("0- Sair do programa!");
        System.out.println("");
        System.out.print("Escolha uma opção: ");
    }

    public static void alterar(LinkedList<String> nome){
        Scanner in = new Scanner(System.in);
        if (nome.size() == 0 ){
            System.out.println("Está vázio! Você não pode alterar.");
        }else{
            String pessoa;
            System.out.print("Digite o nome da tarefa que deseja alterar: ");
            pessoa = in.nextLine();

            int index = Collections.binarySearch(nome, pessoa);

            if(index == -2){
                System.out.println("Tarefa não encontrada");
                return;
            }

            if(pessoa.equals(nome.get(index))){
                System.out.println("Tarefa encontrada!");
                String novoNome;
                System.out.print("Digite a nova tarefa: ");
                novoNome = in.nextLine();
                nome.set(index, novoNome);
                System.out.println("Atualização efetuada!");
            }
        }
    }

}

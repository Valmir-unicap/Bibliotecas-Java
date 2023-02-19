import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class estudoArrayList {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>();
        System.out.println("Convidados da festa");
        int escolha;
        do{
            menu();
            escolha = in.nextInt();
            switch (escolha){
                case 1:
                    adicionar(nomes);
                    ordenar(nomes);
                    break;
                case 2:
                    removerEspecifo(nomes);
                    break;
                case 3:
                    percorrerTipo1(nomes);
                    break;
                case 4:
                    alterar(nomes);
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

    public static void adicionar(ArrayList<String> pessoas){
        Scanner in = new Scanner(System.in);
        String nome;
        System.out.print("Digite o nome da pessoa: ");
        nome = in.nextLine();
        pessoas.add(nome);
        System.out.println("Inserção efetuada!");
    }

    public static void percorrerTipo1(ArrayList<String> pessoas){ //Percorrendo um ArrayList
        int i;
        if(pessoas.size() == 0){
            System.out.println("Está vázio! Você não pode consultar.");
        }else{
            for (i = 0; i < pessoas.size(); i = i+1) {
                System.out.println(pessoas.get(i));
            }
        }
    }

    public static void percorrerTipo2(ArrayList<String> newPessoas){ //Outra maneira de percorrer um ArrayList
        if(newPessoas.size() == 0){
            System.out.println("Está vázio! Você não pode consultar.");
        }else{
            for (String i : newPessoas) {
                System.out.println(i);
            }
        }
    }

    public static void removerEspecifo(ArrayList<String> nome){ //Delete
        if(nome.size() == 0){
            System.out.println("Está vázio! Você não pode remover.");
        }else {
            Scanner in = new Scanner(System.in);
            String recebe;
            System.out.print("Digite o nome de quem deseja remover da lista: ");
            recebe = in.nextLine();
            nome.remove(recebe);
            System.out.println("Remoção efetuada!");
        }
    }

    public static void menu(){
        System.out.println("");
        System.out.println("Menu");
        System.out.println("");
        System.out.println("1- Adicionar");
        System.out.println("2- Remover");
        System.out.println("3- Consultar");
        System.out.println("4- Alterar");
        System.out.println("0- Sair do programa!");
        System.out.println("");
        System.out.print("Escolha uma opção: ");
    }

    public static void ordenar(ArrayList<String> nome){
        if (nome.size() == 0 ){
            System.out.println("Está vázio!");
        }else{
            Collections.sort(nome);
        }
    }

    public static void alterar(ArrayList<String> nome){
        Scanner in = new Scanner(System.in);
        if (nome.size() == 0 ){
            System.out.println("Está vázio! Você não pode alterar.");
        }else{
            String pessoa;
            System.out.print("Digite o nome de quem deseja alterar: ");
            pessoa = in.nextLine();
            int contador=0;

            for (String i : nome) {

                if(pessoa.equals(i)){
                    System.out.println("Nome encontrado!");
                    String novoNome;
                    System.out.print("Digite o novo nome: ");
                    novoNome = in.nextLine();
                    nome.set(contador, novoNome);
                    System.out.println("Atualização efetuada!");
                    return;
                }
                contador++;
            }
            System.out.println("Nome não encontrado");
        }
    }

}

import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        int choice;
        do{
            menu();
            choice= in.nextInt();

            switch (choice){
                case 1:
                    adicionarPilha(pilha);
                    break;

                case 2:
                    removerPilha(pilha);
                    break;

                case 3:
                    consultarPilha(pilha);
                    break;

                case 4:
                    topoPilha(pilha);
                    break;

                case 0:
                    System.out.println("Fim do programa! @Developer Valmir Junior");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente!");
                    break;
            }

        }while(choice!=0);

    }

    public static void adicionarPilha(Stack<Integer> pilha){
        Scanner in = new Scanner(System.in);
        int number;
        System.out.print("Digite um número: ");
        number = in.nextInt();
        pilha.push(number);
        System.out.println("Inserção efetuada na stack!");
    }

    public static void removerPilha(Stack<Integer> pilha){
        if (pilha.empty() == true){
            System.out.println("Stack vázia!");
        }else{
            System.out.println("Remoção efetuada: "+pilha.pop());
        }
    }

    public static void menu(){
        System.out.println("");
        System.out.println("Stack de números inteiros");
        System.out.println("");
        System.out.println("Menu de opções");
        System.out.println("");
        System.out.println("1- Adicinar no topo da stack");
        System.out.println("2- Remover no topo da stack");
        System.out.println("3- Consultar stack");
        System.out.println("4- Ver topo da stack");
        System.out.println("0- Sair do programa!");
        System.out.println("");
        System.out.print("Escolha uma opção: ");
    }

    public static void topoPilha(Stack<Integer> pilha){
        if (pilha.empty() == true){
            System.out.println("Stack vázia!");
        }else {
            System.out.println("Topo da Stack: "+pilha.peek());
        }
    }

    public static void consultarPilha(Stack<Integer> pilha){
        if (pilha.empty() == true){
            System.out.println("Stack vázia!");
        }else {
            System.out.println("Stack elements: ");
            for(int i: pilha) {
                System.out.println(i);
            }
        }
    }

}

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
/*
Author Valmir Junior
 */
public class estudoFifo {
    public static void main(String[] args) {
        Deque <Integer> deque = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        int escolha;
        try {
            do{
                menu();
                escolha = in.nextInt();

                switch (escolha){
                    case 1:
                        addFirst(deque);
                        break;

                    case 2:
                        addLast(deque);
                        break;

                    case 3:
                        if(deque.size() == 0){
                            System.out.println("Fila vázia!");
                        }else {
                            System.out.println("Remoção feita no inicio da fila: " + deque.removeFirst());
                        }
                        break;

                    case 4:
                        if(deque.size() == 0){
                            System.out.println("Fila vázia!");
                        }else {
                            System.out.println("Remoção feita no final da fila: " + deque.removeLast());
                        }
                        break;

                    case 5:
                        if(deque.size() == 0){
                            System.out.println("Fila vázia!");
                        }else {
                            for (int fila : deque) {
                                System.out.println("Números na Fila = " + fila);
                            }
                        }
                        break;

                    case 6:
                        if(deque.size() == 0){
                            System.out.println("Fila vázia!");
                        }else {
                            System.out.println("Próximo da fila: " + deque.peek());
                        }
                        break;

                    case 0:
                        System.out.println("Fim do programa! @Developer Valmir Junior!");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente!");
                        break;
                }
            }while(escolha!=0);
        }catch (Exception e){
            System.out.println("Erro de tipagem! Tente novamente!");
        }

    }

    public static void menu(){
        System.out.println("____________________________________________________________");
        System.out.println("|                    Fila de Números!                      |");
        System.out.println("|==========================================================|");
        System.out.println("|                1- Adicionar no inicio da fila            |");
        System.out.println("|                2- Adicionar no final da fila             |");
        System.out.println("|                3- Remover no inicio da fila              |");
        System.out.println("|                4- Remover no final da fila               |");
        System.out.println("|                5- Exibir fila completa                   |");
        System.out.println("|                6- Exibir próximo da fila                 |");
        System.out.println("|                0- Sair do programa!                      |");
        System.out.println("|__________________________________________________________|");
        System.out.print("Escolha uma opção: ");
    }
    public static void addFirst(Deque <Integer> deque){
        Scanner in = new Scanner(System.in);
        try {
            int numero;
            System.out.print("Digite um número: ");
            numero = in.nextInt();
            deque.addFirst(numero);
            System.out.println("Número adionado!");
        }catch (Exception e){
            System.out.println("Erro de tipagem! Tente novamente!");
            in.nextLine();//Limpeza de buffer
        }
    }
    public static void addLast(Deque <Integer> deque){
        Scanner in = new Scanner(System.in);
        try {
            int numero;
            System.out.print("Digite um número: ");
            numero = in.nextInt();
            deque.addLast(numero);
            System.out.println("Número adionado!");
        }catch (Exception e){
            System.out.println("Erro de tipagem! Tente novamente!");
            in.nextLine();//Limpeza de buffer
        }
    }
}

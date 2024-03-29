import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teams {

    public void runTeams(){
        Scanner in = new Scanner(System.in);
        Formula1 formula1 = new Formula1();
        HashSet<String> ferrari = new HashSet<>();
        String piloto, novoPiloto;
        int escolha=0;

        do{
            menu();
            escolha = validarEscolha(escolha);

            switch (escolha){

                case 1:
                    System.out.print("Digite nome do piloto: ");
                    piloto = in.nextLine();
                    formula1.adicionar(ferrari,piloto);
                    break;

                case 2:
                    System.out.print("Digite nome do piloto: ");
                    piloto = in.nextLine();
                    formula1.remover(ferrari,piloto);
                    break;

                case 3:
                    System.out.print("Digite nome do piloto atual: ");
                    piloto = in.nextLine();
                    System.out.print("Digite nome do novo piloto: ");
                    novoPiloto = in.nextLine();
                    formula1.update(ferrari,piloto,novoPiloto);
                    break;

                case 4:
                    System.out.println("Pilotos na equipe:");
                    formula1.exibirTodosPilotos(ferrari);
                    break;

                case 5:
                    System.out.println("Quantidade de pilotos = "+ferrari.size());
                    break;

                case 0:
                    System.out.println("Fim do programa!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente!");
                    break;
            }
        }while(escolha!=0);
    }

    private static void menu(){
        System.out.println("============== Fórmula 1 ===============");
        System.out.println();
        System.out.println("Menu");
        System.out.println();
        System.out.println("1- Adicionar Piloto na equipe");
        System.out.println("2- Remover Piloto da equipe");
        System.out.println("3- Atualizar Piloto da equipe");
        System.out.println("4- Exibir todos os pilotos da equipe");
        System.out.println("5- Quantidade de pilotos da equipe");
        System.out.println("0- Sair do programa!");
        System.out.print("Escolha uma opção: ");
    }

    private int validarEscolha(int escolha){
        Scanner in = new Scanner(System.in);
        try{
            escolha = in.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            return -1;
        }
        return escolha;
    }
}

//package estudoHashMap;
import java.util.HashMap;
import java.util.Scanner;
public class estudoHashMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Double> tabelaProdutos= new HashMap<String, Double>();
        int escolha;
        do{
            menu();
            System.out.print("Escolha uma opção: ");
            escolha = in.nextInt();
            switch(escolha){
                case 1:
                    adicionarProduto(tabelaProdutos);
                    break;
                case 2:
                    removerProduto(tabelaProdutos);
                    break;

                case 3:
                    consultarProduto(tabelaProdutos);
                    break;

                case 4:
                    quantidadeProdutos(tabelaProdutos);
                    break;

                case 5:
                    listarProdutos(tabelaProdutos);
                    break;

                case 0:
                    System.out.println("Fim do programa! @Developer Valmir Junior");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente!");
                    break;
            }
        }while (escolha!=0);
    }
    public static void menu(){
        System.out.println("------------------------------------------------- ");
        System.out.println("Tabela de produtos");
        System.out.println("------------------------------------------------- ");
        System.out.println("1- Cadastrar Produto");
        System.out.println("2- Remover Produto");
        System.out.println("3- Consultar Produto");
        System.out.println("4- Quantidade de produtos cadastrados");
        System.out.println("5- Exibir todos os produtos");
        System.out.println("0- Sair do programa");
    }
    public static void adicionarProduto(HashMap<String, Double> TabelaProdutos){
            Scanner in = new Scanner(System.in);
            String produto;
            double preco;
            try{
                System.out.print("Digite o nome do produto: ");
                produto = in.nextLine();
                System.out.print("Digite o preço do produto " + produto + ": ");
                preco = in.nextDouble();
                TabelaProdutos.put(produto, preco);
                System.out.println("Produto cadastrado!");
            }catch (Exception e){
                System.out.println("Erro de tipagem! Tente novamente!");
            }
    }
    public static void consultarProduto(HashMap<String, Double> TabelaProdutos){
        Scanner in = new Scanner(System.in);
        String produto;
        if( TabelaProdutos.size() == 0){
            System.out.println("Tabela Vazia!");
        }else {
            try {
                System.out.print("Digite o nome do produto: ");
                produto = in.nextLine();
                if (TabelaProdutos.get(produto) == null) {
                    System.out.println("Produto não encontrado!");
                }else{
                    System.out.println("Preço do " + produto + ": " + TabelaProdutos.get(produto));
                    System.out.println("Consulta efetuada!");
                }
            } catch (Exception e) {
                System.out.println("Erro de tipagem! Tente novamente!");
            }
        }
    }
    public static void removerProduto(HashMap<String, Double> TabelaProdutos){
        Scanner in = new Scanner(System.in);
        String produto;
        if( TabelaProdutos.size() == 0) {
            System.out.println("Tabela Vazia!");
        }else{
            try {
                System.out.print("Digite o nome do produto: ");
                produto = in.nextLine();
                if (TabelaProdutos.remove(produto) == null) {
                    System.out.println("Produto não encontrado!");
                } else {
                    System.out.println("Remoção efetuada!");
                }
            } catch (Exception e) {
                System.out.println("Erro de tipagem! Tente novamente!");
            }
        }
    }
    public static void quantidadeProdutos(HashMap<String,Double> TabelaProdutos){
        System.out.println("Total de produtos cadastrado: "+TabelaProdutos.size());
    }
    public static void listarProdutos(HashMap<String,Double> TabelaProdutos){
        if( TabelaProdutos.size() == 0) {
            System.out.println("Tabela Vazia!");
        }else {
            for (String i : TabelaProdutos.keySet()) {
                System.out.println("Produto: " + i + " | Preço: " + TabelaProdutos.get(i));
            }
        }
    }
}

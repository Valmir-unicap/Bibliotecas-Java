import java.util.HashSet;

public class Formula1 {
    public void adicionar(HashSet<String> equipe, String piloto){
        if(equipe.isEmpty()) {
            System.out.println("Equipe vázia! Inserção efetuada!");
            equipe.add(piloto);

        }else{
            equipe.add(piloto);
            System.out.println("Inserção efetuada!");
        }
    }

    public void remover(HashSet<String> equipe, String piloto){
        if(equipe.isEmpty()){
            System.out.println("Equipe vázia! Remoção não foi efetuada!");

        } else if (equipe.contains(piloto)) {
            System.out.println("Remoção efetuada!");
            equipe.remove(piloto);

        } else {
            System.out.println("Piloto não está na equipe! Remoção não efetuada!");
        }
    }

    public void update(HashSet<String> equipe, String piloto, String novoPiloto){
        if(equipe.isEmpty()){
            System.out.println("Equipe vázia! Upadate não foi efetuado!");
        }
        if(equipe.contains(piloto)){
            remover(equipe,piloto);
            adicionar(equipe,novoPiloto);

        }else{
            System.out.println("Piloto não encontrado!");
        }
    }

    public void exibirTodosPilotos(HashSet<String> equipe){
        if(equipe.isEmpty()){
            System.out.println("Equipe vázia!");
        }else{
            for (String i : equipe) {
                System.out.println("- "+ i);
            }
        }
    }
}

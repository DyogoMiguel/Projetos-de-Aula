import java.util.ArrayList;
public class Ex3 {
    public static void main(String []args){
        ArrayList<Carro> car = new ArrayList<>();

        System.out.println("-- Carros diferenciados --");

        car.add(new Carro("Azul", "Three Wheeler", "3"));
        car.add(new Carro("Preto", "BMW", "14"));

        System.out.println("-- Carro de tricículo --");
        for (int i=0; i<car.size(); i++){
            Carro rodas = car.get(1);
            System.out.println("Nome: " +rodas.getNome());
            System.out.println("Cor: " +rodas.getCor());
            System.out.println("Rodas: " +rodas.getRodas());
            System.out.println("------------------");
        }
   }
}

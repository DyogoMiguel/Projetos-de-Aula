import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Veiculo> duasRodas = new ArrayList<Veiculo>();
        System.out.println("duasRodas(" +duasRodas.size() + "):" + duasRodas);

        Veiculo primeiro = new Veiculo("bicicleta", "BMX", 1991);
        System.out.println("Primeira:" + primeiro);
        duasRodas.add(primeiro);
        duasRodas.add(new Veiculo("Patinete", "Pé", 2003));

        System.out.println("=[Especificações 1]=======");
        for (int i=0; i<duasRodas.size(); i++){
            Veiculo rodas = duasRodas.get(1);
            System.out.println("Tipo:" +rodas.getTipo());
            System.out.println("Marca:" +rodas.getMarca());
            System.out.println("Ano" +rodas.getAno());
            System.out.println("------------------");
        }
        System.out.println("=[Especificações 2]=======");
        for (Veiculo rodas: duasRodas){
            System.out.println("Tipo:" +rodas.getTipo());
            System.out.println("Marca:" +rodas.getMarca());
            System.out.println("Ano:" +rodas.getAno());
            System.out.println("------------------");

        }
    }
}

import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int tipo = 2;
        Forno forno = new Forno();
        PizzaCalabresa p = new PizzaCalabresa();
        PizzaNapolitana n = new PizzaNapolitana();
        
        System.out.println("Pizza Calabresa (1) ou Napolitana (2)?");
        tipo = in.nextInt();
        
        if(tipo == 1){
        forno.fabricar(p);
    } else if (tipo == 2){
        forno.fabricar(n);
    } else {
        System.out.println("Se mata kskksksk");
    }
    double valorCal = 12.00;
    double valorNap = 15.00;
    double total = valorCal + valorNap;
    
    System.out.println("\nO preço das duas pizzas é de " +total);
        System.exit(0);
    }
}
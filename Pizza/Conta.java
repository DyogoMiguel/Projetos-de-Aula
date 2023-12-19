public class Conta{
    public static void mostrarCalculo(Operacao operacao, double x, double y){
        System.out.println("O resultado é " +operacao.calcular(x, y));
    }
    public static void main(String args[]){
        Conta.mostrarCalculo(new Soma(), 5, 5);
        Conta.mostrarCalculo(new Subtra(), 5, 5);
    }
}
public class Forno{
    public void fabricar(PizzaCalabresa cala){
        cala.preparar();
        cala.assar();
        cala.cobrar();
    }
    public void fabricar(PizzaNapolitana naples){
        naples.preparar();
        naples.assar();
        naples.cobrar();
    }
}
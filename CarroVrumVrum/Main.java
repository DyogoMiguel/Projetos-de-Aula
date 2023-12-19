public class Main{
    public void fazerCarroCorrer(Carro carro){
        carro.Acelerar();
    }
    public void fazerCarroFrear(Carro carro){
        carro.Frear();
    }
    public void fazerCarroDrift(Carro carro){
        carro.Drift();
    }
    public void main(String[]args){
        Main m = new Main();
        m.fazerCarroCorrer(new Carro());
        m.fazerCarroCorrer(new HB20());
        m.fazerCarroCorrer(new Fusca());
        
    }
}

public class Ex2 {
    private String nome;
    private int quant;
    private double valUni;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getQuant(){
        return quant;
    }
    public void setQuant(int quant){
        this.quant = quant;
    }
    public double getValUni(){
        return valUni;
    }
    public void setValUni(double valUni){
        this.valUni = valUni;
    }
    @Override
    public String toString(){
        return "\nProduto " +this.nome+ " custa R$ " +this.valUni+ " quantidade " +this.quant+ " unidade(s)?";
    }
    public double calcularTotal(){
        return this.quant * this.valUni;
    }

}

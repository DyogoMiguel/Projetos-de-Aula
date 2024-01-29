public class Carro {
    private String cor, nome, rodas;

    public Carro(String cor, String nome, String rodas){
        setCor(cor);
        setNome(nome);
        setRodas(rodas);
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRodas(String rodas){
        this.rodas = rodas;
    }
    public String getCor(){
        return cor;
    }
    public String getNome(){
        return nome;
    }
    public String getRodas(){
        return rodas;
    }

    public String toString(){
        return nome +" / "+ cor +" / "+ rodas;
    }
}

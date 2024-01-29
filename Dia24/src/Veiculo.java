import java.util.*;
public class Veiculo {
    private String tipo, marca;
    private int ano;

    public Veiculo(String tipo, String marca, int ano){
        setTipo(tipo);
        setMarca(marca);
        setAno(ano);
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setAno(int ano){
        if (ano < 1990){
            ano = 1990;
        } else {
            this.ano = ano;
        }
    }
    public int getAno(){
        return ano;
    }
    public String getMarca(){
        return marca;
    }
    public String getTipo(){
        return tipo;
    }
    public String toString(){
        return marca + "-" +tipo+ "-" +ano;
    }
}
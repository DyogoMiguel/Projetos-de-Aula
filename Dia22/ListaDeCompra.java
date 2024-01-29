import java.util.*;
public class ListaDeCompra {
    private ArrayList<Ex2> lista;
    public ListaDeCompra(){
        lista = new ArrayList<Ex2>();
    }
    public ArrayList<Ex2> getLista(){
        return lista;
    }
    public void setLista(ArrayList<Ex2> lista){
        this.lista = lista;
    }
    @Override
    public String toString(){
        return "ListaDeCompras{" + "Lista=" + lista + ")";
    }
    public void adicionarProduto (Ex2 p1){
        this.lista.add(p1);
    }
    public void ApagarTudo(){
        this.lista.clear();
    }
    public int obterQuantidadeDeProdutos(){
        return this.lista.size();
    }
    public double calcTotalDaLista(){
        double soma = 0;
        for(int i=0; i<this.lista.size();i++){
            soma = soma + this.lista.get(1).calcularTotal();
        }
        return soma;
    }

}

import java.util.*;
public class Clinica {
    private String horario, nome, espec;

    public Clinica(String nome, String espec){
        setNome(nome);
        setEspec(espec);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEspec(String espec){
        this.espec = espec;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }

    public String getEspec(){
        return espec;
    }
    public String getHorario(){
        return horario;
    }
    public String getNome(){
        return nome;
    }




}

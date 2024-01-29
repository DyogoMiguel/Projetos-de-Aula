import java.util.*;
public class Main {
    public static void main (String []args){
        String aluno1 = "Marquioli", aluno2 = "Samuel", aluno3 = "Luciano Coelho";

        ArrayList<String> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        System.out.println(alunos);

        Collections.sort(alunos);
        System.out.println("Todes em ordem");
        System.out.println(alunos);

        String aluno4 = "Dyogo", aluno5 = "Marlon";
        alunos.add(aluno4);
        alunos.add(aluno5);
        System.out.println(alunos);

        alunos.remove(4);
        System.out.println(alunos);

    }
}

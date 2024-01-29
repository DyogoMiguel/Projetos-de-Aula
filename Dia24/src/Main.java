import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int opc1 =0, opc2 = 0, opc3 = 0;
        Clinica Drauzio = new Clinica("Dráuzio","Acupuntura");
        Clinica Fonso = new Clinica("Fonso", "Dermatologia");
        Clinica Barnabe = new Clinica("Barnabé", "Neurologia");
        ArrayList<Clinica> doutores = new ArrayList<>();
        doutores.add(Drauzio);
        doutores.add(Fonso);
        doutores.add(Barnabe);
        ArrayList<String> horario = new ArrayList<>();
        horario.add("9:00");
        horario.add("13:00");
        horario.add("17:00");
        horario.add("20:00");
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Drauzio");
        nomes.add("Fonso");
        nomes.add("Barnabe");

        while (opc1 != 2){
            System.out.println("--- SISTEMA DE CONSULTAS ---");
            System.out.println("1 - Marcar Consulta");
            System.out.println("2 - Sair");
            opc1 = sc.nextInt();

            switch (opc1) {
                case 1 -> {
                    System.out.println("Doutores disponíveis:");
                    for (int i = 0; i < doutores.size(); i++) {
                        Clinica um = doutores.get(i);
                        System.out.println(i + 1);
                        System.out.println("Nome: " + um.getNome());
                        System.out.println("Especialidade: " + um.getEspec());
                        System.out.println("-----------");
                    }
                    opc2 = sc.nextInt();
                    System.out.println("Selecionar um horário:");
                    System.out.println("1 - 9:00");
                    System.out.println("2 - 13:00");
                    System.out.println("3 - 17:00");
                    System.out.println("4 - 20:00");
                    opc3 = sc.nextInt();
                    System.out.println("--- CONSULTA MARCADA ---");
                    System.out.println("Doutor: " + nomes.get(opc2 - 1));
                    System.out.println("Horário: " + horario.get(opc3 - 1));
                    System.out.println("===========");
                }
                case 2 -> System.exit(0);
            }

        }
    }
}
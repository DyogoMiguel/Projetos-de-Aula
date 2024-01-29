    import java.util.*;
    public class Ex1 {
        public static void main(String []args){
            ArrayList bandas = new ArrayList<>();
            bandas.add("Legião Urbana");
            System.out.println("Adicionando a banda Legião Urbana: ");
            System.out.println(Arrays.toString(bandas.toArray()));
            bandas.add("TNT");
            System.out.println("Adicionando a banda TNT: ");
            System.out.println(Arrays.toString(bandas.toArray()));
            bandas.add("Iron Maiden");
            System.out.println("Adicionando a banda Iron Maiden: ");
            System.out.println(Arrays.toString(bandas.toArray()));
            System.out.println("Quem está no indice 0: ");
            System.out.println(bandas.get(0));
            System.out.println("Adicionando Magazine onde estava o Legião Urbana");
            bandas.add(bandas.indexOf("Legião Urbana"), "Magazine");
            System.out.println(Arrays.toString(bandas.toArray()));
            System.out.println("Número de elementos na lista:");
            System.out.println(bandas.size());
            System.out.println("Removendo o magazine");
            bandas.remove("Magazine");
            System.out.println(Arrays.toString(bandas.toArray()));
            System.out.println("Removendo tudo:");
            bandas.clear();
            System.out.println(Arrays.toString(bandas.toArray()));



            }
        }


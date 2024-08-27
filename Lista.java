import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        // forma resumida de add em uma lista
        List<String> lista = new ArrayList<>(){{
            add("Java");
            add("Spring Boot");
        }};
    
        // forma tradicional
        lista.add("Hibernate");
        lista.add("JUnit");

        for(int i=0; i < lista.size(); i++){
            String elemento1 = lista.get(i);
            for (int x=0; x < lista.size(); x++){
                String elemento2 = lista.get(x);
                if(!elemento1.equals(elemento2)){
                    System.out.println("[" + elemento1 + ", " + elemento2 + "]");
                }
            }
        }

        System.out.println("------------------------------");

        for (String elemento3 : lista) {
            for (String elemento4 : lista) {
                if (!elemento3.equals(elemento4)) {
                    System.out.println("[" + elemento3 + ", " + elemento4 + "]");
                }
            }
        }
    }
}
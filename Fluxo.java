import java.util.Arrays;
import java.util.List;

public class Fluxo {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Rodrigo", "Jasmim", "Joana");
        List<String> nomesFiltrados = nomes.stream() //stream = sequência de elementos
            .filter(name -> name.startsWith("J"))
            .map(String::toUpperCase) // usado para transformar os elementos dentro da stream
            .toList();

        System.out.println(nomesFiltrados); // [JASMIM, JOANA]
    }

}
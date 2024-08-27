import java.util.List;
import java.util.stream.Collectors;

public class EarlyReturnExample {

    public static void main(String[] args) {
        List<Integer> data = List.of(1, 2, 3, 4, 5);
        System.out.println(processData(data)); // Esperado: [2, 4, 6, 8, 10]
        System.out.println(processData(null)); // Esperado: "No data provided"
        System.out.println(processData(List.of())); // Esperado: "Empty data list"
    }

    public static String processData(List<Integer> data) {

        if (data == null) {
            return "No data provided";
        }
        if (data.isEmpty()) {
            return "Empty data list";
        }
        // Process data
        List<Integer> processedData = data.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());
        return processedData.toString();
    }

}
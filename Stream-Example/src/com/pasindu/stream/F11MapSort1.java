import java.util.*;
import java.util.stream.Collectors;

public class F11MapSort1 {
    public static void main(String[] args) {
        Map<Integer, String> vehicles = new HashMap<>();
        vehicles.put(10, "Car");
        vehicles.put(50, "SUV");
        vehicles.put(20, "Jeep");
        vehicles.put(12, "Bus");
        vehicles.put(15, "Ship");
        vehicles.put(16, "Lorry");
        vehicles.put(4, "Cycle");

        List<Integer> keys = new ArrayList<>();
        List<String> names = new ArrayList<>();

        //get list of keys in descending order
        vehicles.entrySet().stream()
                .sorted((v1, v2) -> -v1.getKey().compareTo(v2.getKey()))
                .peek(v -> keys.add(v.getKey()))
                .filter(v -> !v.getValue().equals("Ship"))
                .sorted((v1, v2) -> v1.getValue().compareTo(v2.getValue()))
                .peek(v1 -> names.add(v1.getValue()))
                .collect(Collectors.toList());

        System.out.println(keys);
        System.out.println("-----------------");
        System.out.println(names);

        //get All vehicle names in ascending order except Ship

    }
}

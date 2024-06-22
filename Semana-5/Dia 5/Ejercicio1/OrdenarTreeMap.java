import java.util.TreeMap;

public class OrdenarTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> poblacion = new TreeMap<>();
        
        poblacion.put("Madrid", 6000000);
        poblacion.put("Barcelona", 5500000);
        poblacion.put("Valencia", 1500000);
        
        System.out.println("Población ordenada por ciudad:");
        for (String ciudad : poblacion.keySet()) {
            System.out.println(ciudad + ": " + poblacion.get(ciudad));
        }
    }
}

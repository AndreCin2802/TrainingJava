import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {
        Map<String , Integer> campeoesMundiaisFifa = new HashMap<>();

        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Itália", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Inglaterra", 2);

        System.out.println(campeoesMundiaisFifa);

        campeoesMundiaisFifa.put("Chile", 3);


        System.out.println(campeoesMundiaisFifa.containsKey("Argentina"));

        System.out.println(campeoesMundiaisFifa.get("França"));

        System.out.println(campeoesMundiaisFifa.size());

        campeoesMundiaisFifa.remove("França");


        for(Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}

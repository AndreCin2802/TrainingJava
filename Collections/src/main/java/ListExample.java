import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");

        nomes.set(2, "Larissa");


        System.out.println(nomes);

        Collections.sort(nomes);


        nomes.set(2, "André");

        System.out.println(nomes);


        nomes.remove(0);

        String nome = nomes.get(3);

        System.out.println(nome);


        boolean haveAnderson = nomes.contains("Anderson");

        System.out.println(haveAnderson);

        for (String items : nomes) {
            System.out.println(items);
        }

        List<String> novosNomes = new ArrayList<>();

        novosNomes.add("André");
        novosNomes.add("Roberto");

        var teste = nomes.get(2).matches("André");

        System.out.println("Tem andré" + teste);


        novosNomes.addAll(nomes);

        System.out.println(novosNomes);


    }

}

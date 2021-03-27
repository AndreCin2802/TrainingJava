package Atividades.portalOnline;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        HashSet<Integer> cursoA = new HashSet<>();
        HashSet<Integer> cursoB = new HashSet<>();
        HashSet<Integer> cursoC = new HashSet<>();

        cursoA.add(21);
        cursoA.add(35);
        cursoA.add(22);

        cursoB.add(21);
        cursoB.add(50);

        cursoC.add(42);
        cursoC.add(35);
        cursoC.add(13);

        System.out.println(cursoA);
        System.out.println(cursoB);
        System.out.println(cursoC);



        cursoA.addAll(cursoB);
        cursoA.addAll(cursoC);

        System.out.println(cursoA.size());

        HashMap<String, Integer> votos = new HashMap<>();

        for(int i = 0; i < 5 ; i++) {


            if(votos.containsKey("Alex blue")) {
                int votosSoFar = votos.get("Alex blue");
                votos.put("Alex blue", i + votosSoFar );
            }

            else {
                votos.put("Alex blue", i);
            }
        }

        System.out.println(votos);

    }
}

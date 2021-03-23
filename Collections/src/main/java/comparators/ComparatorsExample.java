package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExample {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("André", 20));
        estudantes.add(new Estudante("Rafaeeeel", 25));
        estudantes.add(new Estudante("Maria", 18));
        estudantes.add(new Estudante("Rebeca", 22));
        estudantes.add(new Estudante("João", 30));
        estudantes.add(new Estudante("zin",15));

        System.out.println(estudantes);


        estudantes.sort((a,b) -> a.getNome().compareToIgnoreCase(b.getNome()));

        System.out.println(estudantes);





    }
}

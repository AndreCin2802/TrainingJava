package map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {


    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Paulo");
        estudantes.add("Joao");
        estudantes.add("Maria");
        estudantes.add("Rebeca");

        System.out.println("Contagem: " + estudantes.stream().count());



        System.out.println("Maior numero de letras: " +
                estudantes.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Menor numero de letras: " +
                estudantes.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Com R: " +
                estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r"))
                        .collect(Collectors.toList()));


        System.out.println("Retorna uma nova coleção com a quantidade de letras: " +
                estudantes.stream().map(estudante -> estudante.concat(" - ")
                        .concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        estudantes.forEach(System.out::println);

        System.out.println("Tem algum elemento com W no nome? " + estudantes.stream().allMatch(elemento -> elemento.contains("W")));

        System.out.println("Tem algum elemento com a minusculo no nome? " + estudantes.stream().anyMatch(elemento -> elemento.contains("a")));

        System.out.println("Não tem nenhum elemento com a minuscula no nome? " + estudantes.stream().noneMatch(elemento -> elemento.contains("a")));
    }




}

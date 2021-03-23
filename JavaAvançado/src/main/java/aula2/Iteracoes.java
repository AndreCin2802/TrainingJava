package aula2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

    public static void main(String[] args) {
        String[] nomes = {"Joao", "Paulo", "Oliveira", "Santos", "Instrutor", "Java"};

        Integer[] numeros = {1, 2, 3, 4, 5};


        imprimirNomesFiltrados(nomes);

        imprimirDobro(numeros);


    }

    public static void imprimirNomesFiltrados(String... nomes) {
        Stream.of(nomes).forEach(nome -> System.out.println(nome));

        String nomesParaImprimirStream =
                Stream.of(nomes).filter(nome -> nome.equals("Joao")).collect(Collectors.joining());


    }

    public  static void imprimirDobro(Integer[] numeros) {

        Stream.of(numeros).forEach(numero -> System.out.println(numero * 2));

        var guardarNumerosMap =
                Stream.of(numeros).map(numero -> numero * 2).collect(Collectors.toList());

        System.out.println(guardarNumerosMap);
    }



}

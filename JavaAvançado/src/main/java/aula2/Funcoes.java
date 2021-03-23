package aula2;

import java.util.function.Function;

public class Funcoes {


    public static void main(String[] args) {
        Function<String, String> retornaNomeAoContrario =
                texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornaNomeAoContrario.apply("Joao"));

    }
}

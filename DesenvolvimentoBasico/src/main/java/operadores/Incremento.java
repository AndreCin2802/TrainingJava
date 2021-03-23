package operadores;

import java.util.stream.IntStream;

public class Incremento {
    public static void main(String[] args) {
        IntStream.of(1,2,3,4,5).forEach(System.out::println);

        IntStream.range(0,3).forEach(System.out::println);
    }
}

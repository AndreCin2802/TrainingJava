package aula3;

import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        System.out.println(fatorial(11));
        long fim = System.currentTimeMillis();

        System.out.println("Tempo de execucao : : "+ (fim-inicio));


    }

    public static long fatorial(long num) {
        long fat = 1;
        for (long i = 2; i <=num; i++) {
            fat*=i;
        }

        return fat;
    }
}

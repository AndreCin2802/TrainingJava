package aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a,b) -> a + b;
        System.out.println(executarOperacao(soma, 1, 30));
    }

    public static int executarOperacao(Calculo calculo, int a , int b) {

        return calculo.calcular(a,b);

    }
}


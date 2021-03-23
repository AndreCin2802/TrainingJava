package solid.LSP.solution;

import solid.LSP.problem.Quadrado;
import solid.LSP.problem.Retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Quadrado();

        retangulo.setAltura(10);
        retangulo.setLargura(5);

        System.out.println("Area: "+ retangulo.getArea());


    }
}

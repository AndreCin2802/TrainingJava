package one.digitalinnovation.classes.objetos;

public class Polimorfismo {

    public static void main(String[] args) {
        Moto honda = new Moto(150, "Honda", "ADV");
        honda.setCilindradas("150");

        System.out.printf("O valor venal da %s é de %.4s", honda.getModelo(), honda.calculaImposto());

        Carro3 civic = new Carro3(200,"Honda","Civic" );

        civic.setQuantidadeDePortas(4);

        System.out.printf("O valor venal do %s é de %.2s", civic.getModelo(), civic.calculaImposto());


    }
}

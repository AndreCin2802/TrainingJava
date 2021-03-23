package one.digitalinnovation.interfaces;

public class Programa {
    public static void main(String[] args) {
        final Carro gol = new Gol();

        System.out.println(gol.marca());
        gol.ligar();
        System.out.println(gol.codigoRenavan());

        final Veiculo trator = new Trator();
        System.out.println(trator.registro());
        trator.ligar();

        final Fiesta fiesta = new Fiesta();
        System.out.println(fiesta.codigoRenavan());
        fiesta.teste();






    }
}

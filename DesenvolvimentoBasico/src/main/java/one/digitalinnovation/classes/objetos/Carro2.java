package one.digitalinnovation.classes.objetos;

public class Carro2 {

    public String marca;
    public String modelo;
    public Integer ano;
    final String variante;


    public Carro2(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.variante = "Random";
    }


    public static void main(String[] args) {
        Carro2 carro = new Carro2("bmw", "z4", 2014);


        System.out.printf("O ano do carro é %s, o seu modelo é %s e a marca é %s", carro.ano, carro.modelo, carro.marca);
        System.out.println("\n" + carro.variante);
    }
}

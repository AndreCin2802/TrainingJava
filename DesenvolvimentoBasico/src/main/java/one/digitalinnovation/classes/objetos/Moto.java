package one.digitalinnovation.classes.objetos;

public class Moto extends Veiculo{

    private String cilindradas;

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(double valorVenal, String marca, String modelo) {
        super(valorVenal, marca, modelo);
    }

    public double calculaImposto() {
        return this.getValorVenal() * 0.03;
    }
}

package one.digitalinnovation.classes.objetos;

public class Veiculo {

    private double valorVenal;
    private final String marca;
    private final String modelo;


    public Veiculo(double valorVenal, String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.valorVenal = valorVenal;

    }

    public double getValorVenal() {
        return valorVenal;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public double calculaImposto() {
        return  this.valorVenal * 0.01;
    }
}

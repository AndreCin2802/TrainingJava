package one.digitalinnovation.classes.objetos;

public class Carro3 extends Veiculo{

    private int quantidadeDePortas;

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public Carro3(double valorVenal, String marca, String modelo) {
        super(valorVenal, marca, modelo);
    }

    public double calculaImposto() {
        return this.getValorVenal() * 0.07;
    }
}

package solid.LSP.problem;

public class Retangulo {
    public double altura;

    public double largura;

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura(){
        return  largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getArea() {
        return altura * largura;
    }
}

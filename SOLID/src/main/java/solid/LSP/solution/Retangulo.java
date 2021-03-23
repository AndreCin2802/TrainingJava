package solid.LSP.solution;

public class Retangulo implements  AreaGeometrica{
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


    @Override
    public double getArea() {
        return altura * largura;
    }
}

package solid.LSP.solution;

public class Quadrado extends Retangulo implements AreaGeometrica{

    @Override
    public void setAltura(double altura) {
        super.setAltura(altura);
        super.setLargura(altura);
    }

    @Override
    public void setLargura(double largura){
        super.setLargura(largura);
        super.setAltura(largura);
    }


}

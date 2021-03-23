package solid.LSP.problem;

public class Quadrado extends Retangulo{

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

package solid.OCP.solution;

public class DescontoLivroInfantil implements DescontoLivro{

    @Override
    public double valorDesconto() {
        return 0.3;
    }
}

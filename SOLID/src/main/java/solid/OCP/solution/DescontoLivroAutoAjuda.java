package solid.OCP.solution;

public class DescontoLivroAutoAjuda implements DescontoLivro{

    @Override
    public double valorDesconto() {
        return 0.5;
    }
}

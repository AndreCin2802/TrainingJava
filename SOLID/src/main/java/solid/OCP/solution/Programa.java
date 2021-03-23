package solid.OCP.solution;

public class Programa {
    public static void main(String[] args) {
        ControladorDeDesconto controladorDeDesconto = new ControladorDeDesconto();

        DescontoLivroAcao descontoLivroAcao = new DescontoLivroAcao();

        System.out.println(controladorDeDesconto.adicionaDescontoLivro(descontoLivroAcao));
    }
}

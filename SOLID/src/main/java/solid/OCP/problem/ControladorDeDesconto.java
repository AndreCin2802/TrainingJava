package solid.OCP.problem;

public class ControladorDeDesconto {

    public void adicionarDescontoLivroInfantil(DescontoLivroInfantil descontoLivroInfantil) {
        descontoLivroInfantil.valorDescontoLivroInfantil();
    }

    public void adicionarDescontoLivroAutoAjuda(DescontoLivroAutoAjuda descontoLivroAutoAjuda) {
        descontoLivroAutoAjuda.valorDescontoLivroAutoAjuda();
    }

    public void adicionarDescontoLivroAcao(DescontoLivroAcao descontoLivroAcao) {
        descontoLivroAcao.descontoLivroAcao();
    }
}

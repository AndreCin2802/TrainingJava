package solid.SRP.problem;

import solid.SRP.solution.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeCompra {
    private final List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {produtos.add(produto);}

    public void removerProduto(Produto produto) {produtos.remove(produto);}

    public BigDecimal calcularTotal() {
        return null;

    }


    public List<OrdemDeCompra> buscarOrdemDeCompra() {
        return new ArrayList<>();
    }

    public void salvarOrdemCompra(){
        // salva lista de produtos na base de dados
    }

    public void  enviarEmail(String email) {
        // envia email da ordem de compra
    }

    public void imprimirOrdemDeCompra(){
        // imprime a ordem de compra
    }
}

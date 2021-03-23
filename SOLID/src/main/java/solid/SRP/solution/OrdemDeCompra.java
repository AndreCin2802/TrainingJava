package solid.SRP.solution;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//responsável pela regra de negócio da classe

public class OrdemDeCompra {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {produtos.add(produto);}

    public void removerProduto(Produto produto) {produtos.remove(produto);}

    public BigDecimal calcularTotal() {
        return  null;

    }


}

//Responsável pela persistência e entrega dos dados
class OrdemDeCompraRepository {
    public List<OrdemDeCompra> buscarOrdensDeCompra() {

        //retorna a lista de ordem de compra da base de dados

        return new ArrayList<>();
    }

    public void salvarOrdemDeCompra(OrdemDeCompra ordemDeCompra){
        // salva lista de produtos na base de dados
    }
}

// Responsável pelo envio de email

class OrdemDeCompraMail{
    public void enviarEmail(OrdemDeCompra ordemDeCompra, String emaiil) {
        // envia email da ordem de compra
    }
}
package solid.DIP.solution;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private final DbConnection dbConnection;

    public ProdutoRepository(DbConnection dbConnection   ) {
        this.dbConnection = dbConnection;
    }

    public void conexao() {
        System.out.println("Conexão no banco : " + dbConnection.getName());

    }

    public List<Produto> buscarProduto() {

        return new ArrayList<>();

    }

    public void salvarProduto(Produto produto) {

    }
}

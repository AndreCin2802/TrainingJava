package solid.DIP.problem;



import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private final MySqlConnection mySqlConnection;



    public ProdutoRepository(MySqlConnection connection) {

        this.mySqlConnection = new MySqlConnection();
    }

    public List<Produto> buscarProduto() {
        return new ArrayList<>();

    }

    public void salvarProduto(Produto produto) {

    }
}

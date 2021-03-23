package solid.DIP.solution;

import solid.DIP.solution.ProdutoRepository;

public class Produto {
    public static void main(String[] args) {

        DbConnection connection = new OracleConnection();


        ProdutoRepository teste = new ProdutoRepository(connection);

        teste.conexao();

        System.out.println(connection.getName());




    }
}


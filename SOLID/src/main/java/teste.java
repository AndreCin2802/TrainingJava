import solid.DIP.solution.DbConnection;
import solid.DIP.solution.OracleConnection;
import solid.DIP.solution.ProdutoRepository;

import java.io.IOException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import java.util.*;

public class teste {
    public static void main(String[] args){

        DbConnection connection = new OracleConnection();


        ProdutoRepository teste = new ProdutoRepository(connection);

        teste.conexao();

        System.out.println(connection.getName());


    }
}

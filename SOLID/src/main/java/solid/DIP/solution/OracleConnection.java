package solid.DIP.solution;

public class OracleConnection implements DbConnection{
    @Override
    public String getName() {
        return "OracleDB";
    }
}

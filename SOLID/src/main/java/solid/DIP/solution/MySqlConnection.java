package solid.DIP.solution;

public class MySqlConnection implements DbConnection{
    @Override
    public String getName() {
        return "MySQL";
    }
}

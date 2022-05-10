package creational.factory;

public class MySqlDriver extends NewDatabaseDriver{
    @Override
    public void connect() {
        System.out.println("Mysql");
    }

    @Override
    public NewDatabaseDriver createDriver() {
        return new MySqlDriver();
    }
}

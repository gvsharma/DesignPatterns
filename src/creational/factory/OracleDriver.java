package creational.factory;

public class OracleDriver extends NewDatabaseDriver {

    @Override
    public void connect() {
        System.out.println("Oracle");
    }

    @Override
    public NewDatabaseDriver createDriver() {
        return new OracleDriver();
    }
}

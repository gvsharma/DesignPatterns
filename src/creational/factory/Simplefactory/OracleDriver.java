package creational.factory.Simplefactory;

public class OracleDriver implements DatabaseDriver{
    @Override
    public void connect() {
        System.out.println("Oracle");
    }

    @Override
    public void quwry() {

    }

    @Override
    public void close() {

    }
}

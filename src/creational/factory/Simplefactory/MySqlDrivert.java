package creational.factory.Simplefactory;

public class MySqlDrivert implements DatabaseDriver{
    @Override
    public void connect() {
        System.out.println("Mysql");
    }

    @Override
    public void quwry() {

    }

    @Override
    public void close() {

    }
}

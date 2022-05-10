package creational.factory;

public abstract class NewDatabaseDriver {
    public NewDatabaseDriver initialise() {
        NewDatabaseDriver newDatabaseDriver = createDriver();
        newDatabaseDriver.connect();
        return newDatabaseDriver;
    }

    public abstract void connect();

    public abstract NewDatabaseDriver createDriver();
}

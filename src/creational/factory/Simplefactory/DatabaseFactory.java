package creational.factory.Simplefactory;

public class DatabaseFactory {

    public static DatabaseDriver getDatabaseDriver(String driverType) {
        if(driverType.equalsIgnoreCase("oracle")){
            return new OracleDriver();
        } else if(driverType.equalsIgnoreCase("mysql")){
            return new MySqlDrivert();
        }

        return null;
    }
}

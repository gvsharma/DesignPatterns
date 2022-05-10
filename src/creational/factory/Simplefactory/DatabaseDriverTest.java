package creational.factory.Simplefactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DatabaseDriverTest {

    DatabaseDriver databaseDriver = null;

    @Before
    public void setup()  {
        databaseDriver = new MySqlDrivert();
    }

    @Test
    public void testDriverClass(){
        String driver = "oracle";

    }

    @Test
    public void testDriver(){
//        String driver = "oracle";
//        DatabaseDriver databaseDriver = DatabaseFactory.getDatabaseDriver(driver);
//        Assert.assertEquals(OracleDriver.class, databaseDriver.getClass());
    }
}

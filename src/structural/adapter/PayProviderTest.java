package structural.adapter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PayProviderTest {
    PaymentProviderInterface paymentProviderInterface = null;

    @Before
    public void setup(){
        paymentProviderInterface = new RazorPayProvider();
    }
    @Test
    public void testMarkLink(){
        Assert.assertTrue(paymentProviderInterface instanceof RazorPayProvider);
        String link = paymentProviderInterface.generateLink();
        Assert.assertEquals("RazorPay", link);
    }

    @Test
    public void testCheckStatus(){
        PaymentStatus status = paymentProviderInterface.checkStatus();
        Assert.assertEquals(PaymentStatus.SUCCESS, status);
    }
}

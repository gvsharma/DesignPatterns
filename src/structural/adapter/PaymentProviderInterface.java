package structural.adapter;

public interface PaymentProviderInterface {
    public String generateLink();

    public void pay(PaymentRequest request);

    public PaymentStatus checkStatus();
}

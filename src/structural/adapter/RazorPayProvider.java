package structural.adapter;

import structural.external.RazorPayApi;
import structural.external.RazorPayStatus;

public class RazorPayProvider implements PaymentProviderInterface{

    private RazorPayApi razorPayApi = new RazorPayApi();

    @Override
    public String generateLink() {
        return razorPayApi.markLink();
    }

    @Override
    public void pay(PaymentRequest request) {
        razorPayApi.prePay();
        razorPayApi.pay(request.getName(), request.getAmount());
    }

    @Override
    public PaymentStatus checkStatus() {
        RazorPayStatus status = razorPayApi.checkStatus();
        return toPaymentStatus(status);
    }

    private PaymentStatus toPaymentStatus(RazorPayStatus status) {
        if(status == RazorPayStatus.PASS){
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILURE;
    }
}

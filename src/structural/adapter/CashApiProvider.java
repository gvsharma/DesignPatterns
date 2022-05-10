package structural.adapter;

import structural.external.CashAPIStatus;
import structural.external.CashFreeApi;

public class CashApiProvider implements PaymentProviderInterface {

    private CashFreeApi cashFreeApi;
    @Override
    public String generateLink() {
        return cashFreeApi.markLink();
    }

    @Override
    public void pay(PaymentRequest request) {
        cashFreeApi.prePay();
        cashFreeApi.pay(request.getName(), request.getAmount());
    }

    @Override
    public PaymentStatus checkStatus() {
        CashAPIStatus status = cashFreeApi.checkStatus();
        return tpPaymentStatus(status);
    }

    private PaymentStatus tpPaymentStatus(CashAPIStatus status) {
        if(status == CashAPIStatus.OK){
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILURE;
    }
}

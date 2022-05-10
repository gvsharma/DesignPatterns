package structural.external;

public class RazorPayApi {
    public String markLink(){
        return "RazorPay";
    }

    public void prePay(){
        System.out.print("Razor pay");
    }

    public void pay(String name, int amount){
        System.out.print("RazorPay");
    }

    public RazorPayStatus checkStatus(){
        return RazorPayStatus.PASS;
    }
}

package structural.external;

public class CashFreeApi {
    public String markLink(){
        return "Cash Api";
    }

    public void prePay(){
        System.out.print("Cash Api pay");
    }

    public void pay(String name, int amount){
        System.out.print("Cash Api pay");
    }

    public CashAPIStatus checkStatus(){
        return CashAPIStatus.OK;
    }
}

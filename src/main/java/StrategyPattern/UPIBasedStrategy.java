package StrategyPattern;

public class UPIBasedStrategy implements PaymentStrategy {

    private final String mobileNo;

    public UPIBasedStrategy(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by UPI");
        System.out.println("User Mobile No - " + this.mobileNo);
    }
}

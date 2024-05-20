package StrategyPattern;

public class CreditCardStrategy implements PaymentStrategy {

    private final String cardNo;
    private final String expiryDate;
    private final String cvv;

    public CreditCardStrategy(String cardNo, String expiryDate, String cvv) {
        this.cardNo = cardNo;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {

        System.out.println(amount + " paid by CreditCard!");
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "CreditCardDetails : {" +
                "cardNo='" + cardNo + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }

}

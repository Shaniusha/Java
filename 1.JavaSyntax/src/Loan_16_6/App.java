package Loan_16_6;

public class App {
    public static void main(String[] args) {
        Loan loan = new Loan(1000d,2d);
        loan.calcSimplePayment(100d);
        loan.calcSimplePayment1(370d);

        Loan loan1 = new Loan(50000d,4.5d);
        loan1.calcSimplePayment(3000d);
        loan1.calcSimplePayment1(3500d);

        Loan loan2 = new Loan(25000d,4d,250d);
        loan.setMinPayment(200d);
    }
}

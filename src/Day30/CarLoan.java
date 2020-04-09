package Day30;

public class CarLoan extends Loan {
    double APR;
  int creditScore;

    public CarLoan(int accountNumber, String accountName, double balance, double interestRate, int numberOfPaymet, double loanAmount, double APR, int creditScore) {
        super(accountNumber, accountName, balance, interestRate, numberOfPaymet, loanAmount);
        this.APR = APR;
        this.creditScore = creditScore;
    }public double calculateMonthlyPayment(){
        double monthly=super.loanAmount*this.APR/super.numberOfPaymet-(this.creditScore/10);
        return monthly;
    }
}

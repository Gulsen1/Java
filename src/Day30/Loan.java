package Day30;

public class Loan extends Bank {
    double interestRate;
    int numberOfPaymet;
    double loanAmount;

    public Loan(int accountNumber, String accountName, double balance, double interestRate,
                int numberOfPaymet, double loanAmount) {
        super(accountNumber, accountName, balance);
        this.interestRate = interestRate;
        this.numberOfPaymet = numberOfPaymet;
        this.loanAmount = loanAmount;


    }  double calculateMonthlyPayment(){
        double monthly=this.loanAmount*this.interestRate/this.numberOfPaymet;
        return monthly;
    }double calculateTotalPayment(){
        double total=this.loanAmount*this.interestRate;
        return total;
    }
}

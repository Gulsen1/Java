package Day30;

public class HomeLoan extends Loan{
double PMI;

    public HomeLoan(int accountNumber, String accountName, double balance, double interestRate, int numberOfPaymet,
                    double loanAmount, double PMI) {
        super(accountNumber, accountName, balance, interestRate, numberOfPaymet, loanAmount);
        this.PMI = PMI;
    }public double calculateMonthlyPayment(){
        return  super.loanAmount*super.interestRate/super.numberOfPaymet*this.PMI;
    }public double calculateTotalPayment(){
        return  super.loanAmount*super.interestRate+this.PMI*super.numberOfPaymet;
    }




}

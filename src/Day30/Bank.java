package Day30;

public class Bank {
    int accountNumber;
    String accountName;
    double balance;

    public Bank(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    public void addMoney( double amount){
        this.balance+=amount;

    }public void drawMoney(double amount){

        if(amount<this.balance){
            this.balance-=amount;
        }else{
            System.out.println("Balance is not enough for this balance");
        }

    }public  void changeAccountName(String newName){
        this.accountName=newName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}

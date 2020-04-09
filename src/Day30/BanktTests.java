package Day30;

public class BanktTests {
    public static void main(String[] args) {
        Bank myBank=new Bank(11234,"saving", 350);
            Loan myLoan=new Loan(123334,"new loan",4000,
                    1.5,72,400000);
           Loan myCarLoan=new CarLoan(111,"car",
                345,2,15,30000,3,15);
        System.out.println( myCarLoan.calculateMonthlyPayment());
        Loan myHomeLoan=new HomeLoan(123,"home",900000,
                1.9,3090,6000,3);

        }
    }


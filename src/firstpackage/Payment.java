package firstpackage;

import java.util.Scanner;
public class Payment {
    public static void main( String[] args){

        Scanner myScanner= new Scanner(System.in);
        System.out.println("please enter monthly payment");


        float MSRP;
        MSRP =myScanner.nextFloat();

        System.out.println("please enter monthly payment");

        float driverDiscount;
        driverDiscount=myScanner.nextFloat();
        System.out.println("please enter monthly payment");

        int months= myScanner.nextInt();
       // double monthlyPayment=(MSRP*((float)100-driverDiscount)/100))/months;


       // System.out.println("monthly payment is"+monthlyPayment);
    }

}

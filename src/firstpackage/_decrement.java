package firstpackage;
import java.util.Scanner;
public class _decrement { // calculate the per kw electric bills below 500, between 500 and 1000 , under 2000

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your consumption");


        double number = scanner.nextDouble();
        double electricbill;

        if (number < 501) {
            // System.out.println("per kw"+0.3*number);

            electricbill = number * 0.3;
        } else if (number < 1001) {
            // System.out.println("the value is="+number*0.4+"kw");
            electricbill = number * 0.4;

        } else if (number < 2001) {
            // System.out.println("the value is="+number*0.5+"kw");
            electricbill = number * 0.5;
            System.out.print("heeey");
        } else {

            //System.out.println( "the value is="+number*0.6+"kw");
            electricbill=number*0.6;
        }
        System.out.format("$%.2f",electricbill);// be careful you need to write just format


    }
}
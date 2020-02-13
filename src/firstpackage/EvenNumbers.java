package firstpackage;
import java. util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
Scanner scanner =new Scanner(System.in);
        System.out.println("please  start enter any numbers");

        int number=scanner.nextInt();

        System.out.println("please  start end numbers");
        int number1=scanner.nextInt();

        for(int i=number; i<=number1; i++)

        if( i%5==0 ){
            System.out.println(i);

            /* if( start<end){
            for( int i =start; i<=end;i=i+5){

            sout(i);
            }

           }

           else {
           for (int=end;i>=start; i=i-5{
           sout(i)

           }

           }


             */
        }
    }
}

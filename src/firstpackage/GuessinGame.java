package firstpackage;
import java.util.Scanner;
public class GuessinGame {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int guessnumber=16;
        int number=0;


        while(guessnumber!=number) {
           System.out.println("enter guess number ");
              number=scanner.nextInt();

           if (number > guessnumber) {
               System.out.println("larger try gain");

           } else if (number < guessnumber) {
               System.out.println("smaller try agaiun");

           } else   {
               System.out.println("Congrat");

           }
       }

       }



    }





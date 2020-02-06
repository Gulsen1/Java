package firstpackage;
import java.util.Scanner;
public class ifElse {


    public static void main(String[] args) {

        Scanner myScanner=new Scanner(System.in);

        System.out.println("please enter a year");
        int year=myScanner.nextInt();


        if (year >= 2000)
        {

            System.out.println("after milenium");


        }else

            {
            System.out.println("before milenium");
            }
    }
}
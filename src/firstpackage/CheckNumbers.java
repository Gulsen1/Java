package firstpackage;
import java.util.Scanner;
public class CheckNumbers {


    public static void main(String[] args){



        Scanner scanner=new Scanner(System.in);
        System.out.println("PLEASE ENTER ANY NUMBER ");

        int number=scanner.nextInt();

        if (number%2==0)

        {

            System.out.println(number+" this is a even number");

        }else{

            System.out.println(number+" this is odd number");
        }


    }
}

package firstpackage;
import java.util.Scanner;
public class OddNumberif {
    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number:");



        int number=scanner.nextInt();
        int remainder=number%2;

        //if ( !(0==number%2)){
        if(remainder==1){

            System.out.println("THIS IS A ODD NUMBER");
        }
    }
}

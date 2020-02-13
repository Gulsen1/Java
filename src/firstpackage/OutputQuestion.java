package firstpackage;
import java.util.Scanner;
public class OutputQuestion {

    public static void main (String[] args){

        Scanner scanner =new Scanner(System.in);


        System.out.println("do you wanna study math or art :");
        String response=scanner.nextLine();

        if (response.equalsIgnoreCase("math")){

            System.out.println("Do you want to get tutor y/n");
            response=scanner.next();
            if (response.equalsIgnoreCase("y")){
                System.out.println("okay");
            }else if (response.equalsIgnoreCase("n")){

                System.out.println("Study yourself");
            }else{
                System.out.println("please enter y/n");
            }

        }else if (response.equalsIgnoreCase("Art")){
            System.out.println("nice choice ");
        }else{
            System.out.println("Only art or math");
        }

    }

}

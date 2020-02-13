package firstpackage;
import java.util.Scanner;
public class NestedIf {

    public static void main(String[] args){
       Scanner scanner =new Scanner(System.in);

        System.out.println("Are you subscribed YES/NO ");
         String  type=scanner.nextLine();

        if (type.equals("yes")){
            // ask usage
            System.out.println("Please enter your what gb do you want");

            int usage=scanner.nextInt();

            if (usage<=100 && usage>0){
                System.out.println("10 usd");
            }else {
                System.out.println("40 usd");
            }

        }else{
            System.out.println("you need to be  subscribed");
        }

    }
}

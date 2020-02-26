package firstpackage;
import java.util.Scanner;
public class WhileLoopYes {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String answer=" ";

        while(!answer.equalsIgnoreCase("y")){
            System.out.println("Java is fun(y/n)");

            answer=scanner.next();

        }
        System.out.println("YES IT IS FUN");

    }
}

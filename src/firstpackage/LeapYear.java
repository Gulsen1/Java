package firstpackage;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your grade");

        int grade = scanner.nextInt();
         if(grade<0){
          System.out.println("grade  cannot b eless than 0");
}
     else if(grade < 50) {
            System.out.println("your grade is fail");
        } else if (grade <60) {
            System.out.println(" your grade is D");

        } else if (grade<=70) {
            System.out.println("your grade is fail");
        } else if (grade<=80) {
            System.out.println("your grade is fail");
        } else if (grade<=90) {
            System.out.println();
         } else if (grade<=100) {
            System.out.println();
        } else if (grade<=101) {
            System.out.println();

    }else {
             System.out.println(" it cannot be larger than that number");
         }
}
}
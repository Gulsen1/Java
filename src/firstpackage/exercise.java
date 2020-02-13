package firstpackage;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Size s/m/l");
        String size = scanner.next();

        System.out.println("Member ?(Y/N ):");
        String member=scanner.next();

        if (member.equals("Y")){
            System.out.println("OK");
        }else{
            System.out.println("We can not sell");
        }


        if (size.equals("s")){

            System.out.println("$9.99");
        }else if(size.equals("m")){
            System.out.println("$10.99");
        }else if(size.compareToIgnoreCase("L")==0){

            System.out.println("$11.99");
        }else{
            System.out.println("sorry only S/M/L");
        }









    }
}
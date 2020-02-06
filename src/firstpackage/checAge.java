package firstpackage;

import java.util.Scanner;

public class checAge {

    public static void main(String[] args){


        Scanner scanner=new Scanner(System.in);

        System.out.println("PLEASE ENTER ANY AGE");

        int age=scanner.nextInt();

        if (age<=0)

        {
            System.out.println("Cannot be negative");

        }else if(age>0&& age<=120){

            System.out.println("It is valid");
        }else{
            System.out.println("It is not valid");
        }
    }


}

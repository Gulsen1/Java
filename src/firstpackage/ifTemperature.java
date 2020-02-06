package firstpackage;

import java.util.Scanner;

public class ifTemperature {

    public static void main(String[]args){

      Scanner scan=new Scanner(System.in);

      System.out.println("please enter degree");

        int temp=scan.nextInt();

        if(temp>30  ){

             System.out.println(" wear jacket");


    }else{
            System.out.println("wear a hat ");
        }



    }



}

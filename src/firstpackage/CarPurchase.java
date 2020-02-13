package firstpackage;

import java.sql.SQLOutput;
import java.util.Scanner;
public class CarPurchase {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Which model do you want to use X/Y ");
        String model=scanner.next();
         int MRCS=0;
        if (model.equals("x")){
            MRCS=30000;

            System.out.println("Do you want body package  Y/N");
            String body=scanner.next();

            if(body.equals("y")){
               MRCS +=5000;}


            System.out.println("Do you want to sound system");
            String sound=scanner.next();
            if(sound.equals("y")){
                MRCS+=3000;
                }
        }else if(model.equals("Y")){
            System.out.println("Do you want to buy entertainment package");
            MRCS=35000;
            String entertainment=scanner.next();
            if (entertainment.equalsIgnoreCase("y")){
            MRCS+=8000;
             }
            System.out.println("Do you wannt to buy safety package?");
             String safety=scanner.next();
            if (safety.equalsIgnoreCase("y")) {
                MRCS+=3000;
            }

        }else{

            System.out.println("You should  choose X or Y sorry");
        }
        if(MRCS!=0) {
            System.out.println(MRCS);
        }
    }
}

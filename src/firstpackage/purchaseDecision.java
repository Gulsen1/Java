package firstpackage;
import java.util.Scanner;
public class purchaseDecision {
    public static void main(String[] args){


        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter color(blue/red):");
        String color=scanner.nextLine();

        System.out.println("please enter color tag price :");
        double priceTag=scanner.nextDouble();

        System.out.println("please enter discount percentage (0.1-0.9) :");
        float discount=scanner.nextFloat();


       int colorValue=0;

        if (color.compareToIgnoreCase("red")==0){
            colorValue=20;

        }else if (color.compareToIgnoreCase("blue")==0){
            colorValue=10;
            System.out.println();


        }else{
            System.out.println("red or blue is only");
        }

        double productPoint= priceTag*discount-colorValue;

        if(productPoint>=100){
    System.out.println("do not but item");

        }else if(productPoint>=50){
    System.out.println("buy it later");

        }else{
    System.out.println(" buy it right now!!!");
        }

    }

}
package firstpackage;
import java.util.Scanner;
public class InputQuestion2 {
    public static void main(String[] args){



        Scanner scannerMine=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE WIDTH:");
        int width;
        width=scannerMine.nextInt();
        int height;
        height=scannerMine.nextInt();
        System.out.format("the area of the rectangle with  is %d and %d is %d", width, height, width*height);


    }







}

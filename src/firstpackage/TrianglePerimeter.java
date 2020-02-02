package firstpackage;

import java.util.Scanner;
public class TrianglePerimeter {
    public static void main(String[] args){

        Scanner myKeyboard= new Scanner(System.in);
         int userInput1,userInput2,userInput3;

        userInput1=myKeyboard.nextInt();
        userInput2=myKeyboard.nextInt();
        userInput3=myKeyboard.nextInt();

        System.out.println(userInput1+userInput2+userInput3);

    }
}

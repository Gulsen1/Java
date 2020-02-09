package firstpackage;


import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("please enter ant M or F");
        String gender = scanner.nextLine();

        if (gender.equals("M")) {
            System.out.println("this male");

        } else if (gender.equals("F")) {
            System.out.println("female");
        } else {


            System.out.println("please enter M or F ");
        }

    }
}
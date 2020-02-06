package firstpackage;

import java.util.Scanner;

public class ifElseTriangle {
    // lets calculate whether it is triangle or not
        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter triangle first edge");
        int edge1 = scan.nextInt();
        System.out.println("please enter  triangle second edge");
        int edge2 = scan.nextInt();
        System.out.println ("please enter triangle third  edge");
        int edge3 = scan.nextInt();


        if (edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge1 + edge3 > edge2)
        {

            System.out.println(" this is a triangle");


        } else {
            System.out.println("this is not triagngle ");
        }
    }
}
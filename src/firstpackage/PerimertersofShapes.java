package firstpackage;


import java.util.Scanner;
public class PerimertersofShapes {

    public static void main(String[] args) {
        // Creating Scanner object to read from keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter circle=C, Rectangle=R, Triangle=T, ");
        //Receiving answer from the user
        String type = scanner.next();

        if (type.compareToIgnoreCase("c")==0){ //(type.equals("C")) {   //FOR THE CIRCLE
            //ask radius from the user
            System.out.println("radius:");
            double r = scanner.nextDouble();
            System.out.println(" the circle perimeter is =" + 2 * 3.14 * r);

        } else if (type.compareToIgnoreCase("R")==0){//(type.equals("R"))
            // ask width and height  from the user
            System.out.println("width:");
            int width = scanner.nextInt();
            System.out.println("height:");
            int height = scanner.nextInt();
            System.out.println("the rectangle perimeter is="+2*(height+width));
        } else if(type.compareToIgnoreCase("T")==0){   // (type.equals("T"))
            // ask the edges from the user
            System.out.println("edge 1");
            int edge1 = scanner.nextInt();
            System.out.println("edge2");
            int edge2 = scanner.nextInt();
            System.out.println("edge3");
            int edge3 = scanner.nextInt();
            System.out.println("the triangle perimeter  is =" + (edge1 + edge2 + edge3));


        }else{
            System.out.println("Print C,R OR T");
        }
    }
}

          //type.compareToIgnoreCase// type.compare.ToCase are important thing that we need to ignore upper case lower case
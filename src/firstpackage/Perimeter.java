package firstpackage;
import java.util.Scanner;
public class Perimeter {
    public static void main( String[] args){
    Scanner myScanner=new Scanner(System.in);

    double radius;


        System.out.print( "please enter radius:");

        radius=myScanner.nextDouble();

        System.out.println( "the perimeter of this circle is"+(2*3.14*radius));
        System.out.format("PERIMETER WIDTH 3 FRACTIONAL PART: %.3f",2*3.14*radius );
}
}
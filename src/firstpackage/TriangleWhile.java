package firstpackage;

public class TriangleWhile {
    public static void main(String[] args) {

        int i=0;
        int j;

        while (i<20){
            j=0;
            while(j<i){
                System.out.println("*");
                j++;
            }
            System.out.println();

        }
    }
}

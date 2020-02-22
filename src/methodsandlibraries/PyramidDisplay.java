package methodsandlibraries;

public class PyramidDisplay {
    public static void dislayPyramid(int numberOfLines){
        for ( int i=1; i<20; i++){
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        dislayPyramid(10);
        dislayPyramid(5);
        dislayPyramid(20);
    }
}

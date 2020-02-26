package firstpackage;

public class UpsidedownTriangle {
    public static void main(String[] args) {
        for (int i=0;i<=11; i++){
            for( int j=11; j>=i; j--){
                System.out.print(" ");

            }
            for( int k=1; k<=i;k++){
                System.out.print("*  ");
            }
            System.out.println();

        }
    }
}

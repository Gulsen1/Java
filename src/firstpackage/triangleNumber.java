package firstpackage;

public class triangleNumber {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < 11; k++) {//important part
                System.out.print(k + " ");
            }
            System.out.println();

        }

        for (int n = 1; n < 11; n++) {
            for (int s = 1; s <=11-n; s++) {
                System.out.print(" ");
            }
            for (int m =11-n ; m < 11; m++) {//important part
                System.out.print(m + " ");
            }
            System.out.println();


        }


    }

}
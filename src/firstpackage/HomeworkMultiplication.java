package firstpackage;

public class HomeworkMultiplication {
    public static void main(String[] args) {
        for(int i=1;i<=6; i++){
            System.out.print(" ");

        }for(int k=1;k<=10;k++){
            System.out.print (k+"     ");
        }
        System.out.println();
        for( int k=1;k<=70;k++){
            System.out.print("-");
        }
        System.out.println();

        for(int m=1;m<=10;m++)
        {
            System.out.print(m+"   ");
            for(int s=1;s<=10;s++){
                System.out.print(("   "+(m*s)+"  "));
            }
            System.out.println("\n");
        }
    }


    }


package firstpackage;

public class NestedNumbers2 {
    public static void main(String[] args) {
int tens=1;
int ones;

        while(tens<10){

            ones=0;
            while(ones<10){
                System.out.println((tens+""+ones));
                ones++;
            }
            tens++;

        }
    }
}

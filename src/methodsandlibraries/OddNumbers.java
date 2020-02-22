package methodsandlibraries;

public class OddNumbers {
    public static void OddNumber(int x, int y) {
        for(int i=x; i<=y; i++){
            if(i%2!=0){
                System.out.print(i +"\t");
            }
        }


    }
    public static void EvenNumber( int m, int n){
        for ( int i=m; i<=n; i++){
            if(i%2==0){
                System.out.print(i+"\t");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("odd numbers");
        OddNumber(4,20);
        System.out.println();
        System.out.println("even numbers");
        EvenNumber( 1,20);
    }


    }


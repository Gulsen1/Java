package methodsandlibraries;
// Combine the two integer arrays
public class Combine {
    public static void main(String[] args) {
        int[]a={1,2,3};
        int[]b={4,5,6};
        combineArray(a,b);

    }
    public static void combineArray(int[]a, int b[]){
        int []myArray=new int[a.length+b.length];
        for( int i=0; i<a.length;i++) {
            myArray[i] = myArray[i] + a[i];
            System.out.print(myArray[i] + "\t");
        }
            for( int i=0;i<b.length;i++){
                myArray[i+a.length]=myArray[i+a.length]+b[i];
                System.out.print(myArray[i+a.length]+"\t");
            }
        }
    }



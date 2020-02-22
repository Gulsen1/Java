package methodsandlibraries;

public class PrintASCIIValues {
    public static void  listASCII() {
        for(int i=0; i<=256; i++){
            System.out.println((char)i);
        }

    }

    public static void main(String[] args) {
        listASCII();
        double a=Math.pow(3,4);
    }
}

package firstpackage;

public class LetterLoop {
    public static void main(String[] args) {
char letters='a';

        for(int i=1;i<6;i++){

            System.out.print(i+"\t");


       for(int j=0;j<4;j++){
           System.out.print(letters+"\t");
           letters++;

       }
            System.out.println();
       }
                }
}

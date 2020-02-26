package firstpackage;

public class whileNested {

    public static void main(String[] args) {

        int numbers=1;

        char letters='a';

        int count;


        while(numbers<=5){
            count=1;

            System.out.print(numbers+"\t");
           count=0;
            while(count<4){
                System.out.print(letters+"\t");

                count++;
                letters++;
            }
            System.out.println();
            numbers++;
        }

    }
}

package firstpackage;

public class LoopNumbersWhile {
    public static void main(String[] args) {
        int counter;
        int number=1;


        for ( int i=1; i<=4; i++){

       counter=1;
            while(counter<=5){

           if(number%3==0){
                System.out.print("   "  +"\t\t");


                }else
                    {
                System.out.print(number+"\t\t");
            }

                counter++;
                number++;
            }
            System.out.println();
        }



    }
}




package firstpackage;

public class FormatQestion {
    public static void main(String[] args){

        String java="jAVA IS FUN";

        float percentageLarge=78.98f;
        double percentageSmall=78.98000;

        System.out.format("Do you think  %s \n" , java);

        System.out.format("\tyes %% %f of the people think it is fun \n", percentageLarge);

        System.out.format("\tyes %% %.2f of the people think it is fun;", percentageSmall);
    }
}

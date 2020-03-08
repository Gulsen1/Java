package methodsandlibraries;

public class Consecative {
    public static String removeConsecative( String input){

        String removed="";

        int next=1;


        for( int i=0; i<input.length();i++){

            if(input.charAt(i)!=input.charAt(next)){

                removed=removed+ input.charAt(i);

            }if(next<input.length()-1){
                next++;
            }


        }
        removed=removed+input.charAt(input.length()-1);
        return removed;
    }
    //Modified solution

    public static String removeConsecative2(String input){

        String clenned="";// empty variable ( container) created

        clenned+=input.charAt(0);

        for( int i=1; i< input.length();i++){

            if(input.charAt(i-1)!=input.charAt(i)){
                clenned=clenned+input.charAt(i);
            }
        }
        return clenned;

    }
}

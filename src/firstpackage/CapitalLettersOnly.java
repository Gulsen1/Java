package firstpackage;



public class CapitalLettersOnly {

    public static void main(String[] args) {

        String sentence="BootCamp Attendees Rocks K";
        char letter;
        for(int i=0;i<sentence.length();i++){

            letter=sentence.charAt(i);

            if (letter>=65&&letter<=90){

                System.out.println(sentence.charAt(i));
            }
        }
    }
}

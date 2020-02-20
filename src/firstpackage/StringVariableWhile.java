package firstpackage;

public class StringVariableWhile {

    public static void main(String[] args) {

        String myStr = "Sunday is a fun day";
        int index = 0;

        while (index < myStr.length()) {

            if (myStr.charAt(index) == 'u' || myStr.charAt(index) == 'a' || myStr.charAt(index) == 'i' ) {
                System.out.println(myStr.charAt(index));

            } else {
                System.out.println(" ");


            }
            index++;
        }

    }}
package firstpackage;

public class StringVariable {
    public static void main(String[] args) {

        String a = "java is fun";
        for (int index = 0; index < 11; index++) {

            if(a.charAt(index)=='a'||a.charAt(index)=='i'||a.charAt(index)=='u'){
                System.out.println(a.charAt((index)));
            }
        }
    }


}
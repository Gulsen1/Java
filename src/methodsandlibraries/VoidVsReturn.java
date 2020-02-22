package methodsandlibraries;

public class VoidVsReturn {
    public static void method1() {
        System.out.println("A");

    }

    public static String method2() {
        return "B";

    }




    public static void main(String[] args) {
      method1();
      String b=  method2();

    }
}
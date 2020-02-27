package methodsandlibraries;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ATest {
    public static int smht(){
        return 20;
    }


    public static void main(String[] args) {

        System.out.println(smht());
        System.out.println(A.smht());

        A myA= new A();
        int x=A.smht();//next int none static because if you wanna object creation you need to none static.
        System.out.println(x);


      Multiplication.MultiplicationTable();

       ToptooBottom.topBottom("howreyoou");
    }
}

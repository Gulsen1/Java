package Day29;
//This is parent class.
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Calculator {

    protected   int displayValue;

    public Calculator() {
        this.displayValue =0;
        System.out.println(this.displayValue);
    }

    public int add(int n1, int n2){
        return n1+n2;
    }private double divide(int n1,int n2){
        return (double)n1/n2;
    }public int substract(int n1, int n2){
        return n1-n2;
    }public int multply(int n1,int n2){
        return n1*n2;
    }
}

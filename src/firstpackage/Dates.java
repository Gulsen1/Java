package firstpackage;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Dates {
    public static void main(String[] args) {
        for (int month = 1; month < 13; month++) {
            System.out.println("month"+month+"\n_______________________");
            for (int day = 1; day <= 30; day++) {
                System.out.println(month + "/" + day + "/" + 2020);
            }
            if (month != 12) {
                System.out.println("---------------------------");
            }
        }
    }
}
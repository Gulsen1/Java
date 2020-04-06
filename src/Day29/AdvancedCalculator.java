package Day29;


import creating.A;

    public class AdvancedCalculator extends Calculator {

       protected String screenColor;

    public AdvancedCalculator() {

        //This is child class

        super();

        this.screenColor = "blue";

    }public AdvancedCalculator(String color){

        super();

        this.screenColor=color;
    }

    public double calculateAverage(int n1, int n2) {

        return (double) (n1 + n2) / 2;
    }

     public int calcFactorial(int n1) {

        int result = 1;

        for (int i = n1; n1 > 0; i--) {

            result*=i;
        }
        return result;
    }
       public double calSqrt(int n1) {

        return Math.sqrt(n1);
       }

       public int calPower( int n1, int pow){

       return(int) Math.pow(n1,pow);
    }
}


package firstpackage;


import java.util.Scanner;

public class appicationAge {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age:");
    int age = scanner.nextInt();
        System.out.println("Enter your Java Score:");
    double Javapoint=scanner.nextDouble();

    double result=0;

    if ((age<=20 && age<=30) && Javapoint>=80 )  { // Checks the age and javaPoint values

        result= age*1.5+Javapoint * 4.5;// outputs Job applicant based on calculation

    } else if ((age>=20 && age<=30) && Javapoint<80) {// Checks the age and javaPoint values

        result=age*1.5+Javapoint*3.5;

    } else if (age >30&& Javapoint>=80) {

        result= age*1.1+Javapoint*1.5;

    } else if( age>30 && Javapoint<80){

        result=age*1.1+Javapoint*3.5;//outputs Job applicant based on calculation
    }
   else{
        System.out.println("please enter a valid age or java score");// outputs Job applicant based on calculation
}
        System.out.format("%.2f",result);


    }
}
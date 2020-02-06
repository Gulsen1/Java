package firstpackage;

//asking temperature from user
import java.util.Scanner;

public class temperatureIf {

    public static void main(String []args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("PLEASE ENTER ANY Temp");

        int  temp=scanner.nextInt();
// checking temperature
        if (temp<=20)           // if temp is below 20 degrees

    {
        System.out.println("Winter");

    }else if(temp>=21&& temp<=40){ // if temp is higher than 20 degrees and under 40

            System.out.println(" Fall");

    }else if(temp>=41&& temp>=60) // if temp is higher than 40 degrees and under 60
    {
        System.out.println("Spring");
    }
        else{                   // if temp higher 60 degrees
            System.out.println("Summer");
        }
}


}



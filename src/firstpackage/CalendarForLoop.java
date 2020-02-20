package firstpackage;

public class CalendarForLoop {
    public static void main(String[] args) {


        for(int month=1; month<=12; month++){
            for(int day=1; day<=30;day++){
                System.out.println(month+"/"+day+"/"+2020);

            }

            if(month!=12){
                System.out.println("-------------------");
        }else{
                System.out.println();
            }

        }
    }
}

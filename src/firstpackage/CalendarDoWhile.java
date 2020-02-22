package firstpackage;


public class CalendarDoWhile {
    public static void main(String[] args) {

        int month=1;
        int  day=1;
        do {

            day=1;
            do{
                System.out.println(month+"/"+day+"/"+2020);

                day++;

            }while(day<=30);

             month++;
        }while(month<=12);




    }
}

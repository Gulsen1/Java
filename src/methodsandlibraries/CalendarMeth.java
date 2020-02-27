package methodsandlibraries;

public class CalendarMeth {



    public static void calendarDates(int year, String seperator){


        for( int i =1; i<=12; i++){
            System.out.println("Month"+i);

            for( int j=1; j<=30; j++){
                System.out.println(i+ seperator +j+ seperator +year);

            }
            System.out.println("------------------------");

        }
    }




}

package methodsandlibraries;
//print the random cities, find  cities with begining A,printCitiesReversed,reversecities
public class PrintCityNames {
    public static void main(String[] args) {

        String[][] myCities = findCities(4, 3);
        for (String[] row : myCities) {
            for (String city : row) {
                System.out.println(city);
            }
        }
        System.out.println();
        System.out.println();
        printAtoH(myCities);
        System.out.println();
        int [][]myArr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(isSquare(myArr));

    }

    public static String[][] findCities(int rows, int cols) {
        String[] cities = {"Ann Arbor", "Forth Worh", " fairwax", "Orlando", "Denver", "phoneix",
                "Atlanta", "Amarillo", "Denver", "Arlington"};
        String[][] randcities = new String[rows][cols];


        for (int i = 0; i < randcities.length; i++) {

            for (int j = 0; j < randcities[i].length; j++) {

                randcities[i][j] = cities[(int) (Math.random() * cities.length)];
            }
        }
        return randcities;

    }

    public static void printFirstLetterA(String[][] x) {

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                if (x[i][j].charAt(0) == 'A' || x[i][j].charAt(0) == 'a')
                    System.out.println(x[i][j]);
            }

        }
    }

    public static void printCitiesReversed(String[][] cities) {
        for (String row[] : cities) {
            for (String city : row) {
                System.out.println(city);
            }
        }
    }

    public static String reversecities(String text) {
        String[] cities = {"Ann Arbor", "Forth Worh", " fairwax", "Orlando", "Denver", "phoneix", "Atlanta", "Amarillo", "Denver", "Arlington"};

        String reversed = " ";

        for (int k = text.length() - 1; k >= 0; k--) {
            reversed += text.charAt(k);


        }
        return reversed;
    }

    public static void printAtoH(String[][] cities) {
        for (String[] citiesRow : cities) {
            for (String city : citiesRow) {
                if (city.charAt(0) >= 'A' && city.charAt(0) <= 'H') {
                    System.out.println(city);
                }
            }
        }

    }

    public static boolean isSquare(int[][]arr){

        boolean square=true;

        for( int i=0; i<arr.length;i++){
            if(arr.length!=arr[i].length){
                square=false;
            }

        }
        return square;
    }
}
package Day27;

public class AttributesTest {
    public static void main(String[] args) {

         Attributes myObj=new Attributes("xxxxx","John",30000,
                 500,false,"7/10/2020","15/10/2020");
        System.out.println(myObj.toString());
        myObj.borrowDate("3/18/2020");
        System.out.println(myObj.getBorrowdate());
        System.out.println();
         myObj.setAvailailability(true);
         myObj.setBauthor("john");
         myObj.setBtitle("how to fall in love to java ");
         myObj.setBorrowdate("7/10/2020");
         myObj.setReturndate("15/10/2020");
         myObj.setNumpages(500);
        System.out.println(myObj.getAvailailability()+myObj.getReturndate()+myObj.getBtitle()+myObj.getBauthor()+myObj.getISBN());
    }
}

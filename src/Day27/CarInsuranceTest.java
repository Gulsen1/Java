package Day27;

public class CarInsuranceTest {
    public static void main(String[] args) {
        CarInsurance myObj=new CarInsurance(2020,4,0,3000);
        myObj.setModelYear(2020);
        myObj.setNumAccidents(0);
        myObj.setNumTickets(4);
        myObj.setOffer(3000);
        System.out.println(" model year: "+myObj.getModelYear()+" number of tikets: "+myObj.getNumTickets()+" number of accidents: "+myObj.getNumAccidents());
    }
}

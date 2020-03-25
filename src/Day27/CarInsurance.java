package Day27;


import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CarInsurance {
    private int modelYear;
    private int numTickets;
    private int numAccidents;
    private double offer;
  final  double basePrice=99.9;

    public CarInsurance(int modelYear,int numTickets,int numAccidents,double offer){
        this.modelYear=modelYear;
        this.numTickets=numTickets;
        this.numAccidents=numAccidents;
        this.offer=offer=0;

    }public void setModelYear(int modelYear){
        this.modelYear=modelYear;
    }public int getModelYear(){
        return this.modelYear;
    }

    public int getNumTickets() {
        return numTickets;
    }

    public void setNumTickets(int numTickets) {
        this.numTickets = numTickets;
    }

    public int getNumAccidents() {
        return numAccidents;
    }

    public void setNumAccidents(int numAccidents) {
        this.numAccidents = numAccidents;
    }

    public double getOffer() {
        return offer;
    }

    public void setOffer(double offer) {
        this.offer = offer;
    }

    public double getBasePrice() {
        return basePrice;

    }public void makeOffer(int year){
        this.offer=this.basePrice+(year-this.modelYear)*50+(30*this.numTickets)+(100*numAccidents);
        System.out.println("the offer is "+this.offer);
    }

}

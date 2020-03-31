package Day28;

public class CarMaintenance {
    private  String carName;
    private int odometerCurrent;
    private int ododmeterNextOilChange;
    private String cabinFilterStatus;
    private String airFiltersStatus;
    private String oilFilterStatus;

    public CarMaintenance(String carName, int odometerCurrent, int ododmeterNextOilChange, String airFiltersStatus, String oilFilterStatus,String cabinFilterStatus) {
        this.carName = carName;
        this.odometerCurrent = odometerCurrent;
        this.ododmeterNextOilChange = ododmeterNextOilChange;
        this.airFiltersStatus = airFiltersStatus;
        this.oilFilterStatus = oilFilterStatus;
        this.cabinFilterStatus=cabinFilterStatus;

    }public void setCabinFilterStatus(){
        this.cabinFilterStatus=cabinFilterStatus;

    }public String getCabinFilterStatus(){
        return cabinFilterStatus;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getOdometerCurrent() {
        return odometerCurrent;
    }

    public void setOdometerCurrent(int odometerCurrent) {
        this.odometerCurrent = odometerCurrent;
    }

    public int getOdodmeterNextOilChange() {
        return ododmeterNextOilChange;
    }

    public void setOdodmeterNextOilChange(int ododmeterNextOilChange) {
        this.ododmeterNextOilChange = ododmeterNextOilChange;
    }

    public String getAirFiltersStatus() {
        return airFiltersStatus;
    }

    public void setAirFiltersStatus(String airFiltersStatus) {
        this.airFiltersStatus = airFiltersStatus;
    }

    public String getOilFilterStatus() {
        return oilFilterStatus;
    }

    public void setOilFilterStatus(String oilFilterStatus) {
        this.oilFilterStatus = oilFilterStatus;
    }


    public void displayFilterStatus(){

        String status="\t\t\t FILTER STATUS\n"+"Air Filter\t:\t\t"+this.airFiltersStatus+"\n"+"Cabin FILTER\t:"+"\t\t"+this.cabinFilterStatus+
                "\n"+"Oil Filter\t:\t\t";
        System.out.println(status);

    }public void doOilChange(){

        if(!this.oilFilterStatus.equalsIgnoreCase("new")&&this.ododmeterNextOilChange-

                this.odometerCurrent<=0){
            this.oilFilterStatus="new";

        }else{
            System.out.println("You do not need to change oil filter");

        }if(!this.cabinFilterStatus.equalsIgnoreCase("new")&&this.ododmeterNextOilChange-this.odometerCurrent<=0){
            this.cabinFilterStatus="new";
        }
        else{
            System.out.println("Cabin filter is OK");
        }
        if(!this.airFiltersStatus.equalsIgnoreCase("new")&&this.ododmeterNextOilChange-this.odometerCurrent<=0){
            this.airFiltersStatus="new";
        }
        else{
            System.out.println("Air filter is OK");
        }
        this.ododmeterNextOilChange = this.odometerCurrent +5000;
    }
    @Override
    public String toString() {
        return "CarMaintenance{" +
                "carName='" + carName + '\'' +
                ", odometerCurrent=" + odometerCurrent +
                ", ododmeterNextOilChange=" + ododmeterNextOilChange +
                ", airFiltersStatus='" + airFiltersStatus + '\'' +
                ", oilFilterStatus='" + oilFilterStatus + '\'' +
                '}';


}

}









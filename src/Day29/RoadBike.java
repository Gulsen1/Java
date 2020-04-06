package Day29;

public class RoadBike extends BicycleP  {
    private int tireSize;
    private int handsleBarSize;

    public RoadBike(int gear, int speed, int tireSize, int handsleBarSize){
        super(gear,speed);
        this.tireSize=tireSize;
        this.handsleBarSize=handsleBarSize;
    }

}

package Day29;

public class BicycleP {
 protected int gear;
    protected int speed;

    public BicycleP(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }public void  speedUp(int inc){
        this.speed=this.speed+inc;
    }public void speedDown(int dec){
        this.speed=this.speed-dec;


    }
}

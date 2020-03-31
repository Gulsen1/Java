package Day28;

public class CoffeeMaker {
    private int     quantity;
    private   int timer;
    private boolean brew;

    public CoffeeMaker(int quantity, int timer) {
        this.quantity = quantity;
        this.timer = 0;
        this.brew=false;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" +
                "quantity=" + quantity +
                ", timer=" + timer +
                '}';

    }
    public void resetTimer(){
        this.timer=0;
        System.out.println("timer reset it ");
    }public void brewCoffe(){
            if(this.timer==0){
                System.out.println("Coffe started to brew");
            }else{
                System.out.println("Coffe will start to brew in"+this.timer+"minutes");
            }

    }


        }



package Day28;

public class CoffeMakerTest {

    public static void main(String[] args) {

        CoffeeMaker coffe=new CoffeeMaker(5,30);
        System.out.println(coffe.toString());
        coffe.setTimer(20);
        System.out.println(coffe.getTimer());
        coffe.brewCoffe();
        coffe.resetTimer();

        System.out.println(coffe.getQuantity()+coffe.getTimer());
    }
}

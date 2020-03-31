package Day28;

import creating.Car;

public class CarMaintainTest {
    public static void main(String[] args) {

        CarMaintenance myCar=new CarMaintenance("Toyota",6500,70000,
                "new","new","old");
        System.out.println(myCar.toString());


//call the methods that you wrote
        myCar.displayFilterStatus();
        myCar.doOilChange();
        myCar.setAirFiltersStatus("old");
        myCar.doOilChange();
        System.out.println("-------------");
        System.out.println(myCar.getOdodmeterNextOilChange());
        System.out.println(myCar.toString());
        myCar.doOilChange();


    }
}

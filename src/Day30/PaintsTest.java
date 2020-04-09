package Day30;

public class PaintsTest {
    public static void main(String[] args) {
        Paint myPaint=new Paint("zero gravity", 2800);
        System.out.println(myPaint.toString());
        System.out.println(myPaint.calculatePrice());
        CustomPaint myCustomPaint=new CustomPaint("moon blue",3200,
                0,"durable","super glossy");
        System.out.println(myCustomPaint.calculateCustomerPrice());
            }
        }




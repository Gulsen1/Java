package Day28;

public class InterviewClassTest {
    public static void main(String[] args) {
        InterviewClass myObj=new InterviewClass("John",20,true,80,40,30);

        System.out.println(myObj.toString());

        System.out.println(myObj.calculateScore());
        myObj.getScore();

        System.out.println(myObj.calculateScore());

    }
}

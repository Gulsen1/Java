package Day30;

public class ChildTest {
    public static void main(String[] args) {
        Child myChild = new Child(10, 20);
        System.out.println(myChild.getX());
        myChild.setX(30);
        System.out.println(myChild.getX());

        Parent myParent = new Parent(15);
        System.out.println(myParent.getX());
        myParent.setX(35);
        System.out.println(myParent.getX());

    }
}
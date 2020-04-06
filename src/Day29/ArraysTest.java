package Day29;

public class ArraysTest {
    public static void main(String[] args) {
      ArrayOps myArr=new ArrayOps(3,3);
      int[]arr={1,2,3,4,5,6,7,8};
      myArr.findIndex(arr,7);
      //System.out.println(index);
        ArrayStats myStat=new ArrayStats(arr);
        System.out.println(myStat.findMax());
        System.out.println(myStat.findAverage());
        int maxIndex=myStat.findMaxIndex();
        System.out.println(maxIndex);



    }


}

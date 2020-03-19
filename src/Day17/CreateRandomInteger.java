package Day17;

public class CreateRandomInteger {
    public static void main(String[] args) {
        createArrayWithRandoms(10);
    }



    public static void createArrayWithRandoms(int n){
        int arr[]=new int[n];

      for(int i=0;i<arr.length;i++){
         arr[i]=1000+(int)(Math.random()*4000);
          System.out.println(arr[i]);
      }

    }
}

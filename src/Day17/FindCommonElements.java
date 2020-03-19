package Day17;

public class FindCommonElements {
    public static void main(String[] args) {
        int x[]={1,2,3,4,5,6,7,8,9};
        int y[]={5,6,12,4,55,67,99,7};
     SampleArray(x,y);

    }public static void SampleArray(int[]x,int[]y){

        for(int i=0;i<x.length;i++){

            for(int j=0;j<y.length;j++){
                if(x[i]==y[j]){
                    System.out.println(x[i]);

                }
            }

        }
    }
}

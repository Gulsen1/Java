package Day17;

public class mergeArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {55, 66, 777, 8};

        int mergeArryLength = a.length + b.length;

        int mergeArray[] = new int[mergeArryLength];

        for (int i = 0; i < a.length; i++) {
            mergeArray[i] = a[i];

        }

        for (int i =0; i < b.length; i++) {
                mergeArray[i+a.length]=b[i];

        }
        for(int i=0;i<mergeArray.length;i++){
            System.out.print(mergeArray[i]+" ");
        }


        }


    }
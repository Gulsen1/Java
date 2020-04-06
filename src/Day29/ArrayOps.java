package Day29;

public class ArrayOps {
    protected int indexInt;
    protected int indexString;


    public ArrayOps(int indexInt,int indexString) {
        this.indexString = indexString;
        this.indexInt =indexInt;
    }

    public int findIndex(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                this.indexInt = i;
                return this.indexInt;

            }

        }
           return this.indexInt;
    }
    public int findIndex(String arr[],String value){
        for (int i = 0; i < arr.length; i++) {
            if( arr[i].equalsIgnoreCase(value)){
                this.indexString=i;
            }
        }
        return this.indexString;
    }

    @Override
    public String toString() {
        return "ArrayOps{" +
                "indexInt=" + indexInt +
                ", indexString=" + indexString +
                '}';
    }
}
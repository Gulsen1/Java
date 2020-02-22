package firstpackage;

public class o {
    public static void main(String[] args) {

        int a;
        int b=5;

        for(a =b++; a!=b; ++a){
            System.out.println(a+""+b);
            ++b;
            if(a>b){
                a=0;
                b=1;
            }
        }
    }
}

package Day30;

public class Child extends Parent{
    int y ;

    Child( int x, int y){
        super(x);//parent class attribute x initialized using by constructor.
        this.y=y;
    }
void callThisMethod(){
       int a= super.getX();
       a++;
  }
   }



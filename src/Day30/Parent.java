package Day30;

public class Parent {
    private int x;

    Parent(int x) {
        this.x = x;
    }
        void setX(int x){
        if(x>10)
            this.x=x;
        }
        int getX(){
       return this.x;
        }
    }


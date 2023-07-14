package staticKeyword;

public class StaticBlockDemo {
    int x;
    static int cnt;

    public static void main(String[] args) {
        cnt=0;
//        x=0;
        System.out.println("in main method");
    }
    static{
        cnt=0;
//        x=0;
        System.out.println("in static block");

    }
    static{
        System.out.println("in second static block");
    }
    static{
        System.out.println("in third ");
    }

    void display(){
        x=0;
        cnt=0;
    }
    static{
        System.out.println("in four");
    }
}

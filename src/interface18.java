public class interface18 {
    public static void main(String[] args) {
           test t;
           t =new test();
           t.show();
           t.show1();
    }
}
interface l1{
 int a=10;

    public void show();
    default void display(){

    }
    static void screen(){

    }
    static void main(){

    }
}
interface l2{
    void show1();
}
class test implements l1,l2{
    public void show(){
        System.out.println("ffer");
    }
    public void show1(){
        System.out.println("fuck up");
    }
}

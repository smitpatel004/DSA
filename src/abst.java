abstract public class abst {
  abstract void start();
}
class car extends abst{
    void start(){
        System.out.println("car start wirh kdejfjefiewudidsf");
    }
}
class scooter extends abst{
    void start(){
        System.out.println("start with fjkldff");
    }

    public static void main(String[] args) {
//         abst v = new abst();
         car c =new car();
         c.start();
    }



}

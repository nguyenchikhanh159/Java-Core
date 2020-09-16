package stackjava.com;

public class Staticblock {
    static int n;
    static String mystr;
    Staticblock(){
        System.out.println("Constuctor is called after Static block");
    }
    static{
        n=10;
        System.out.println("Static block in here");
        mystr="String Static";
    }
    public static void main(String args[])
    {
//        System.out.println("Value of num: "+n);
//        System.out.println("Value of mystr: "+mystr);
    }
}
class Main {
    public static void main(String args[]) {

        Staticblock obj1 = new Staticblock();
//        Staticblock obj2 = new Staticblock();

        System.out.println(Staticblock.n);
   }
}

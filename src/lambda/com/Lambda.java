package lambda.com;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] agrs) {
        List<Integer> listnumbers = new ArrayList<>();
        listnumbers.add(5);
        listnumbers.add(1);
        listnumbers.add(2);
        listnumbers.add(6);
        listnumbers.forEach( (n) -> {System.out.println(n);});
        Consumer<Integer> printf = (n)->{System.out.println(n);};
        listnumbers.forEach(printf);

        ISquare calculate1 = (int x) -> x*x;
        System.out.println(calculate1.caculatate(5));

        IRectangle calculate2 = (int a,int b) -> a*b;
        System.out.println(calculate2.caculatate(5,10));







   }
}


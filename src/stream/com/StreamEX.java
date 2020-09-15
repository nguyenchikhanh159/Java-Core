package stream.com;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class StreamEX {
    private List<Integer> numbers = Arrays.asList(7, 2, 5, 4, 2, 1);
    private String[] languages = {"Java","Golang","C", "C++", "Nodejs"};

    public long countWithStream() {
        long count = numbers.stream().filter(number -> number%2==0).count();
        return count;
    }
    public List<Integer> collectStream(){
        List<Integer> List = numbers.stream().map(number-> number*number).collect(Collectors.toList());
        return List;
    }
    public int sumNumber(){
        int result = numbers.stream().reduce(0,(a,b)->a+=b);
        return result;
    }
    public void getStreamfromArray(){

        Stream testStream1 = Arrays.stream(languages);
        testStream1.forEach(x -> System.out.println(x));

        Stream testStream2 = Arrays.stream(languages);
        testStream2.forEach(x -> System.out.println(x));


    }
    public void DifferentStreamParallel(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 1; i <= 30;i++)
            arrayList.add(i);

        arrayList.stream().filter(n -> n >10 ).forEach(n -> System.out.println("Stream: "+n));

        arrayList.parallelStream().filter(n -> n > 10).forEach(n -> System.out.println("ParallelStream: "+n));
    }

    public static void main(String[] agrs) {
        StreamEX stream = new StreamEX();
        /////// Count Number with Stream method filter
        System.out.println("Count numbers: " +stream.countWithStream()+"\n");

        /////// Create Steam with primitive
        IntStream.range(1, 4).forEach(number->System.out.println(number));
        IntStream.of(1, 4).forEach(number->System.out.println(number));
        ////// Get Stream from Array
        stream.getStreamfromArray();
        ////// Using Collectors
        System.out.println("collectStream: " +stream.collectStream());
        ///// Sum number with Stream method reduce
        System.out.println("Sum number: " + stream.sumNumber());
        /////////Stream and Parallel Stream
        stream.DifferentStreamParallel();
//        System.out.println(stream.createDummyData());

    }





}

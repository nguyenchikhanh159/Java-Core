package string.com;
import java.lang.String;


public class Strings {
    public static  String concatWithString(){
        String t= "Hello";
        for (int i = 0; i < 100000; i++) {
            t = t + "World";
        }
        return t;
    }
    public static StringBuffer concatWithStringBuffer(){
        StringBuffer sb = new StringBuffer("Hello");
        for (int i = 0; i < 1000000; i++) {
            sb.append("World");
        }
        return sb;
    }
    public static StringBuilder concatWithStringBuilder(){
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 1000000; i++) {
            sb.append("World");
        }
        return sb;
    }

    public static void main(String agrs[]) {
        ////////Str
        String s2 = "elloworld";
        int getlength  = s2.length();
        String s3 = "S3";
        s3.concat(s2);
        System.out.printf("string length is: " + getlength + "\n");
        System.out.printf("string concat: "+ s3 +"\n");
        System.out.printf("string concat: "+ s3.concat(s2) +"\n");
        System.out.printf("string Indexof: "+ s2.indexOf("ll") +"\n");

        ////////BufferString
        ////////Method Append
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append("World");
        System.out.printf("string append: "+ sb1 +"\n");
        ////////Method Insert
        StringBuffer sb2 = new StringBuffer("Hello");
        sb2.insert(2,"World");
        System.out.printf("string insert: "+ sb2 +"\n");
        ////////Method Reverse
        StringBuffer sb3 = new StringBuffer("Hello");
        sb3.reverse();
        System.out.printf("String reverse: "+ sb3 +"\n");
        ////////Method capacity
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity() +"\n");
        sb.append("Hello");
        System.out.println(sb.capacity() +"\n");

        ///////////Different of String, StringBuffer and StringBuilder
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time of concating class string: "
                + (System.currentTimeMillis() - startTime) + "ms" +"\n");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time of concating class stringbuffer: "
                + (System.currentTimeMillis() - startTime) + "ms"+ "\n");
        startTime = System.currentTimeMillis();
        concatWithStringBuilder();
        System.out.println("Time of concating class stringbuilder: "
                + (System.currentTimeMillis() - startTime) + "ms"+ "\n");
    }

    }

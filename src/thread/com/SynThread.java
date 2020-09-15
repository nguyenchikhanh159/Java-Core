package thread.com;
import java.lang.String;
//import string.com.Print;
public class SynThread extends Thread  {

    private  String threadname;
    private int value;
    SynThread(String threadname, int value){
        this.threadname=threadname;
        this.value=value;
        System.out.println("Create Thread" + threadname );
    }

    @Override
    public void run()
    {

        Print.print(threadname,value);
    }
}

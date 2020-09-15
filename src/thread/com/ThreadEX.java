package thread.com;
import java.lang.String;

public class ThreadEX extends Thread  {

    private String threadname;
    ThreadEX(String threadname){
        this.threadname=threadname;
        System.out.println("Create Thread" + threadname );
    }

    @Override
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            for(int i=0;i<3;i++) {
                System.out.println(threadname + " " + i +
                        " is running");
            }
        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}

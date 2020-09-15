package thread.com;

public class RunableThread implements Runnable  {

    private String threadname;
    RunableThread(String threadname){
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
                System.out.println(threadname + ": i: " + i +
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

package string.com;

public class Print {
     synchronized static void print(String threadname,int value){
        try
        {
            // Displaying the thread that is running
            for(int i=0;i<6;i++) {
                System.out.println(threadname + " value is: " + i*value +
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


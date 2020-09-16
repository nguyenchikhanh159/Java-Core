package thread.com;

public class Multithread {
    public static void main(String[] args)
    {
        /////////Extend Thread
//        ThreadEX objthread1 = new ThreadEX("Thread 1");
//                objthread1.start();
//        ThreadEX objthread2 = new ThreadEX("Thread 2");
//        objthread2.start();
//        ThreadEX objthread3 = new ThreadEX("Thread 3");
//        objthread3.start();
        /////////Implement Runnable

        Thread objrunable1 = new Thread(new RunableThread("Thread 1"));
        objrunable1.start();
        Thread objrunable2 = new Thread(new RunableThread("Thread 2"));
        objrunable2.start();
        ///////// Synchronized Thread

//        SynThread synthread1 = new SynThread("Thread 1",1);
//        synthread1.start();
//        SynThread synthread2 = new SynThread("Thread 2",5);
//        synthread2.start();
//        SynThread synthread3 = new SynThread("Thread 3",10);
//        synthread3.start();

    }
}

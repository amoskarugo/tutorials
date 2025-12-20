package MultithreadingandSynchronization;

public class ThreadStartVsRun extends Thread{

    public void run(){

        System.out.println("Thread running using start()");
    }


    public static void main(String[] args) {
        ThreadStartVsRun threadStartVsRun = new ThreadStartVsRun();
        Thread thread = new Thread(threadStartVsRun);

        /*
        * The start() method is used to begin a new thread of execution. It performs two main tasks:
        * Allocates resources for a new thread.
        * Calls the run() method internally in the new thread.
        * */

        //Calling start() creates a new thread. run() is executed in the context of that new thread.
        thread.start();

        /*
        contains the code executed by the thread. However,
        calling run() directly does not create a new thread. Instead,
        it behaves like a normal method call executed in the current thread.
         */
        thread.run(); //r


        //Multiple Invocations


        /*
        * another most important difference between start() and run() method is that we
        *  can't call the start() method twice otherwise it will throw an IllegalStateException
        *  whereas run() method can be called multiple times as it is just a normal method calling.
         *  */

        thread.start();
        thread.start(); // Throws exception
    }
}

package MultithreadingandSynchronization;

public class RunnableInterface {

    private class RunnableImpl implements Runnable{
        // Overriding the run Method
        @Override
        public void run()
        {
            System.out.println(Thread.currentThread().getName()
                    + ", executing run() method!");
        }
    }


    public static void main(String[] args) {
        System.out.println("Main thread is " + Thread.currentThread().getName());

        //creating custom thread
        Thread t = new Thread(new RunnableInterface().new RunnableImpl());
        t.start();
    }
}

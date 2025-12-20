package MultithreadingandSynchronization;

public class ThreadSleepMethod extends Thread{


    /*
    * Thread class contains the sleep() method. There are two overloaded methods of sleep()
    *  method present in Thread Class, one is with one argument and another one is with two arguments
    *
    *
    * Syntax
     There are 2 variations of the sleep() method in Java Thread. These are:
    // public static void sleep(long millis)
   //public static void sleep(long millis, int nanos)
    * */

    @Override
    public void run(){
        try {
            for (int j = 0; j < 6; j++) {
                Thread.sleep(1000);
                System.out.print(j + " ");

                // this will throw the
                // IllegalArgumentException
                //Thread.sleep(-100);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        // Using Thread.sleep() method for Custom thread
        ThreadSleepMethod t = new ThreadSleepMethod();

        t.start();



//        try {
//
//            for (int i = 0; i < 5; i++){
//                Thread.sleep(1000);
//                System.out.println(i);
//            }
//
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }
}

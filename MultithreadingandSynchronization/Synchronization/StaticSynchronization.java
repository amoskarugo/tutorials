package MultithreadingandSynchronization.Synchronization;
/*
* Static synchronization is used to synchronize static methods. In this case,
*  the lock is placed on the class object rather than the instance.
*
* */
public class StaticSynchronization {

    static class Table{

        synchronized static void printTable(int n){


                try {
                    for (int i = 1; i <=3; i++)
                        System.out.println(n * i);
                } catch (Exception e) {
                    System.out.println(e);
                }

        }
    }

    static class Thread1 extends Thread{

        public void run() {
            Table.printTable(1);
        }
    }

    static class Thread2 extends Thread {
        public void run() {
            Table.printTable(10);
        }
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }

}

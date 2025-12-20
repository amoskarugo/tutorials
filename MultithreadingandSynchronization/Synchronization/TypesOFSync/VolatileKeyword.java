package MultithreadingandSynchronization.Synchronization.TypesOFSync;

public class VolatileKeyword {

    static class Counter {
        private volatile boolean running = true;

        public void stop() {
            running = false;
        }

        public void start() {
            new Thread(() -> {
                while (running) {
                    System.out.println("Running...");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Stopped.");
            }).start();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        counter.start();

        Thread.sleep(600); // Let it run briefly
        counter.stop();    // Then stop the thread
    }

    /*
    * Explanation: The volatile variable running ensures that updates made
    *  by one thread (in stop()) are visible to the thread running the loop in start().
    * */
}

Java Multithreading allows concurrent execution of two or more threads, enabling efficient CPU utilization and faster program performance. 
It is commonly used for tasks that required parallel processing and responsiveness from multiple ends

Different Ways to Create Threads

Threads can be created by using two mechanisms:
1. Extending the Thread class

We create a class that extends Thread and override its run() method to define the task. 
Then, we make an object of this class and call start(), which automatically calls run()
and begins the thread’s execution.

2. Implementing the Runnable Interface

We create a new class which implements java.lang.Runnable interface and define the run() method there.
Then we instantiate a Thread object and call start() method on this object. 
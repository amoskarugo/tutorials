Types of Synchronization

There are two type of synchronizations in Java which are listed below:
1. Process Synchronization

Process Synchronization is a technique used to coordinate the execution of multiple processes.
It ensures that the shared resources are safe and in order.


2. Thread Synchronization in Java

Thread Synchronization is used to coordinate and ordering of the execution of the threads in a multi-threaded program.
There are two types of thread synchronization are mentioned below:

    Mutual Exclusive
    Cooperation (Inter-thread communication in Java)

Volatile Keyword

The volatile keyword in Java ensures that all threads have a consistent view of a variable's value. It prevents caching of the variable's value by threads, ensuring that updates to the variable are immediately visible to other threads.

Working of Volatile Modifier:

    It applies only to variables.
    volatile guarantees visibility i.e. any write to a volatile variable is immediately visible to other threads.
    It does not guarantee atomicity, meaning operations like count++ (read-modify-write operations) can still result in inconsistent values
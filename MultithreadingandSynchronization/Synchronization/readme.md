Synchronization in Java is a mechanism that ensures that only one thread can access a shared resource 
(like a variable, object, or method) at a time. It prevents concurrent threads from interfering with 
each other while modifying shared data.

Why is Synchronization Needed?

    Prevents Data Inconsistency: Ensures that multiple threads don’t corrupt shared data when accessing it simultaneously.
    Avoids Race Conditions: Allows only one thread to execute a critical section at a time, maintaining predictable results.
    Maintains Thread Safety: Protects shared resources from concurrent modification by multiple threads.
    Ensures Data Integrity: Keeps shared data accurate and consistent throughout program execution.
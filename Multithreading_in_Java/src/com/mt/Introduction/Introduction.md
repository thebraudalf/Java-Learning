# Java Multithreading

### Threads are the backbone of multithreading. We are living in the real world which in itself is caught on the web surrounded by lots of applications.
### With the advancement in technologies, we cannot achieve the speed required to run them simultaneously unless we introduce the concept of multi-tasking efficiently.
### It is achieved by the concept of thread.

## Threads

### Threads are lightweight subprocesses, representing the smallest unit of execution with separate paths.

## Life Cycle of Thread
### There are different states Thread transfers into during its lifetime and a thread undergoes the following states, namely:
1. New: In this state, code has not yet been run and the execution process is not yet initiated.
2. Runnable: In this state, the thread is ready to run at any given time, and it's the job of the Thread Scheduler to provide the thread time for the runnable state preserved threads.
3. Running: In this state, when the Thread Receives CPU allocated by Thread Scheduler, it transfers from the "Runnable" state to the "Running" state. And after the expiry of its given time slice session, it again moves back to the "Runnable" state and waits for its next time slice.
4. Blocked/Waiting: If a Thread is inactive but on a temporary time, then either it is a waiting or blocked state.
5. Timed Waiting: A thread can enter the timed waiting state when it is waiting for a specific period before resuming execution.
6. Terminated: Once a thread has completed its execution, it moves to the terminated state.

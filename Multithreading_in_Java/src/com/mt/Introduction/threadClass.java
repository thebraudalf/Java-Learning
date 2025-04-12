package com.mt.Introduction;

// Thread Class that has various method calls to manage the behaviour of threads by providing constructors, and methods to perform operations on threads.
public class threadClass extends Thread {

    // run method
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "- Count: " + i);

            try{
                // sleep method
                Thread.sleep(500); // TIMED WAITING
            } catch(InterruptedException error) {
                System.out.println(error.getMessage());
            }
        }
    }

    public static void main(String[]args) {
        threadClass thread1 = new threadClass(); // NEW
        threadClass thread2 = new threadClass();

        thread1.start(); // RUNNABLE
        thread2.start();

    }
}

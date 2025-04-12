package com.mt.Introduction;

// Runnable Interface is an interface that is to be implementing by a class whose instances are intended to be executed by a thread.
// Here we, extending threadClass to show the use of Runnable interface
public class runnableInterface extends threadClass implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[]args){
        System.out.println(Thread.currentThread().getName());

        runnableInterface t1 = new runnableInterface();
        t1.start();

        threadClass t2 = new runnableInterface();
        t2.start();
    }
}

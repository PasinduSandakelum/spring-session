package com.pasindu.java.thread;

public class Printer extends Thread {
    @Override
    public void start() {
        super.start();
        System.out.println("This is start");
    }

    @Override
    public void run() {
//        System.out.println("This is from child thread");
//        for (int j = 0; j < 10; j++)
//            System.out.println("child " + j);

//        for (int j = 0; j < 10; j++)
//            System.out.println("child " + Thread.currentThread().getName() + " " + j);

        for (int j = 0; j < 100; j++)
            System.out.println("child " + Thread.currentThread().getName() + " " + j);

    }
}

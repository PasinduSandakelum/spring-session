package com.pasindu.java.thread;

public class PrinterImpl3 implements Runnable {
    @Override
    public void run() {
        for (int j = 0; j < 50; j++) {
//            Thread.yield();
            System.out.println("child " + " " + j);
        }

    }
}

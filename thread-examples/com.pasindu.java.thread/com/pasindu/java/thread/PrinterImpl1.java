package com.pasindu.java.thread;

public class PrinterImpl1 implements Runnable {
    @Override
    public void run() {
        for (int j = 0; j < 50; j++)
            System.out.println("child " + " " + j);
    }
}

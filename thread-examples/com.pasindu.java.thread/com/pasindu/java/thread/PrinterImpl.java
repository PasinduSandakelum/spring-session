package com.pasindu.java.thread;

public class PrinterImpl implements Runnable {
    @Override
    public void run() {
        for (int j = 0; j < 10; j++)
            System.out.println("child " + " " + j);
    }
}

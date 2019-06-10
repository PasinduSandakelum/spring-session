package com.pasindu.java.thread;

public class PrinterImpl2 implements Runnable {
    @Override
    public void run() {
        for (int j = 0; j < 50; j++) {
            System.out.println("child " + " " + j);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.pasindu.java.thread;

public class PrinterImpl4 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted ");
        }

        for (int j = 0; j < 50; j++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println("Interrupted ");
//            }
            System.out.println("child " + " " + j);
        }

    }
}

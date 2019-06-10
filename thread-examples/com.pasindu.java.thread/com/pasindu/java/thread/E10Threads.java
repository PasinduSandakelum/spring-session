package com.pasindu.java.thread;

public class E10Threads {
    public static void main(String[] args) throws InterruptedException {
        PrinterImpl4 printer=new PrinterImpl4();
        Thread thread=new Thread(printer);
        thread.start();

        for (int i = 0; i < 50; i++)
            System.out.println("main " + Thread.currentThread().getName() + " " + i);

        thread.interrupt();
        System.out.println("=================================================");
    }
}

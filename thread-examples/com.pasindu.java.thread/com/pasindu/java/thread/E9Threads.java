package com.pasindu.java.thread;

public class E9Threads {
    public static void main(String[] args) throws InterruptedException {
        PrinterImpl3 printer=new PrinterImpl3();
        Thread thread=new Thread(printer);
        thread.start();

        for (int i = 0; i < 50; i++)
            System.out.println("main " + Thread.currentThread().getName() + " " + i);

        System.out.println("=================================================");
    }
}

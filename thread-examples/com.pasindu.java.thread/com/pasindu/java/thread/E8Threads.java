package com.pasindu.java.thread;

public class E8Threads {
    public static void main(String[] args) throws InterruptedException {
        PrinterImpl2 printer=new PrinterImpl2();
        Thread thread=new Thread(printer);
        thread.start();

//        thread.join();
        thread.join(5000);

        for (int i = 0; i < 10; i++)
            System.out.println("main " + Thread.currentThread().getName() + " " + i);

        System.out.println("=================================================");
    }
}

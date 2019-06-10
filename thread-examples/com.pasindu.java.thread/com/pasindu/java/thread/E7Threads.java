package com.pasindu.java.thread;

public class E7Threads {
    public static void main(String[] args) {
        System.out.println("main before thread priority "+Thread.currentThread().getPriority());
        PrinterImpl1 printer=new PrinterImpl1();
        Thread.currentThread().setPriority(1);
        Thread thread=new Thread(printer);
//        thread.setPriority(10);

        thread.start();

        System.out.println("main thread priority "+Thread.currentThread().getPriority());

        System.out.println("child thread priority "+thread.getPriority());

        for (int i = 0; i < 50; i++)
            System.out.println("main " + Thread.currentThread().getName() + " " + i);
    }
}

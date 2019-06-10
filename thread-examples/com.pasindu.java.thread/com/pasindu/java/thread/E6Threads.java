package com.pasindu.java.thread;

public class E6Threads {

    public static void main(String[] args) {
        PrinterImpl printer = new PrinterImpl();

        Thread thread=new Thread(printer);

        thread.start();

        for (int i = 0; i < 100; i++)
            System.out.println("main " + Thread.currentThread().getName() + " " + i);

//        System.out.println("=========================================================");
    }
}

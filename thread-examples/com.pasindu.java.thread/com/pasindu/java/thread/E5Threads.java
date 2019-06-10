package com.pasindu.java.thread;

public class E5Threads {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setDaemon(true);
        printer.start();

        for (int i = 0; i < 10; i++)
            System.out.println("main " + Thread.currentThread().getName() + " " + i);

        System.out.println("=========================================================");
    }
}

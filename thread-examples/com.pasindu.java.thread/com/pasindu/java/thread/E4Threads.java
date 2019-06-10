package com.pasindu.java.thread;

public class E4Threads {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.start();

        for (int i = 0; i < 10; i++)
            System.out.println("main " + Thread.currentThread().getName() + " " + i);

        System.out.println("=========================================================");
    }
}

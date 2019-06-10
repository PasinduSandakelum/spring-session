package com.pasindu.java.thread;

public class E3Threads {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.start();

        for (int i = 0; i < 100; i++)
            System.out.println("main " + Thread.currentThread().getName() + " " + i);
    }
}
